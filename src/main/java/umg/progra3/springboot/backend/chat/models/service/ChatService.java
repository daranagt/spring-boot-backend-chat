package umg.progra3.springboot.backend.chat.models.service;

import java.util.List;

import umg.progra3.springboot.backend.chat.models.documents.Mensaje;

public interface ChatService {
	
	public List<Mensaje> obtenerUltimos10Mensajes();
	public Mensaje guardar(Mensaje mensaje);

}
