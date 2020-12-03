/* 	 ESTA CLASSE IRÁ DISPONIBILIZAR UM CONTROLADOR REST
	 * SERÁ DISPONIBILIZADO ESTE RECURSO.
	 * E É O QUE FARÁ A COMUNICAÇÃO ENTRE O FRONT WEB / FRONT MOBILE
	 * COM A APLICAÇÃO BACK END!
	 * 
	 * ESTA CLASSE É UM RECURSO DA ENTIDADE 'CATEGORY'
	 * 
	 * TODO CONTROLADOR PRECISA COLOCAR A ANOTAÇÃO NO INICIO
	 * DA CLASSE @RestController
	 * @RestController, vai efetuar um processamento ao compilar esta classe
	 * e será disponibilizado como recurso
	 * 
	 * o SPRING BOOT utiliza muitas anotações.
	 * 
	 * @RequestMapping(value="") --> é a rota REST do meu recurso
	 * uma boa prática usar o nome do recurso no plural: "categories"
	 * 
	 */

package com.devsuperior.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
		
		@Autowired	
		private CategoryService service;
	
		@GetMapping
		public ResponseEntity<List<Category>> findAll(){
			List<Category> list = service.findAll();
			return ResponseEntity.ok().body(list);
			
		}
	
		
		
}
