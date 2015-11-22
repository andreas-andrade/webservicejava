package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.Produto;

@Path("/produtos")
public class ProdutoResource {

	public Produto geraProdutoFalso(long id) {
		Produto p = new Produto();
		p.setNome("produto" + id);
		p.setPreco(50.0 * id);
		p.setId(id);
		
		return p;
	}
	
	// gera o produto em XML
	@GET
	@Path("/{id}/{xml}")
	@Produces(MediaType.APPLICATION_XML)
	public Produto getProdutoAsXml(@PathParam("id") long id) {
		return this.geraProdutoFalso(id);
	}

	// gera o produto em JSON
	@GET
	@Path("/{id}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto geraProdutoAsJSON(@PathParam("id") long id) {
		return this.geraProdutoFalso(id);
	}

}
