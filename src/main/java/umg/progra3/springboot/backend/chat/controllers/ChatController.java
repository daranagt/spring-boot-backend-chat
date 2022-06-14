package umg.progra3.springboot.backend.chat.controllers;

import java.util.Date;
<<<<<<< HEAD

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import umg.progra3.springboot.backend.chat.models.documents.Mensaje;
import umg.progra3.springboot.backend.chat.models.service.ChatService;
=======
import java.util.Random;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import umg.progra3.springboot.backend.chat.models.documents.Mensaje;
>>>>>>> ef948536703a0f51323ae48dab25a861bee5a2cc

@Controller
public class ChatController {
	
	private String[] colores = {"red","green","blue","magenta","purple","orange"};
	
<<<<<<< HEAD
	@Autowired
	private ChatService chatService;
	
	@Autowired
	private SimpMessagingTemplate webSocket;
	
=======
>>>>>>> ef948536703a0f51323ae48dab25a861bee5a2cc
	@MessageMapping("/mensaje")
	@SendTo("/chat/mensaje")
	public Mensaje recibeMensaje(Mensaje mensaje) {
		mensaje.setFecha(new Date().getTime());
		
		if(mensaje.getTipo().equals("NUEVO_USUARIO")) {
			mensaje.setColor(colores[new Random().nextInt(colores.length)]);
			mensaje.setTexto("nuevo usuario");
<<<<<<< HEAD
		}else {
			chatService.guardar(mensaje);
=======
>>>>>>> ef948536703a0f51323ae48dab25a861bee5a2cc
		}
		
		
		return mensaje;
	}
	
	@MessageMapping("/escribiendo")
	@SendTo("/chat/escribiendo")
	public String estaEscribiendo(String username) {
		return username.concat(" está escribiendo ...");
	}
<<<<<<< HEAD
	
	@MessageMapping("/historial")
	public void historial(String clienteId){
		webSocket.convertAndSend("/chat/historial"+clienteId, chatService.obtenerUltimos10Mensajes());
		
		
	}
	
=======
>>>>>>> ef948536703a0f51323ae48dab25a861bee5a2cc

}
