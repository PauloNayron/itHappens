# it Happens
data: 30 de março de 2019, Desenvolvido em: Java

## Tecnologias e ferramentas utilizadas:
* Spring<br>
Projeto Maven, Linguagem Java, Spring Boot 2.1.3<br>
Depedências: Web, PostgreSQL, Rest Repositories<hr>
* Dbeaver <br> Gerenciamento do PostgreSQL<hr>
* Intelij IDEA<br>Foram adicionadas as Configurações Maven "Clean install" (Command line: clean install) e "Run" (Command line: spring-boot:run)<hr>
* Postman<br>Cliente para consumir a API Desenvolvida


# API Rest

* Porta: 9000
* url base da api: [http://localhost:9000/api](http://localhost:9000/api)

## <u>Produto</u> (localhost:9000)
<table>
    <tr>
        <th>MÉTODO</th>
        <th></th>
        <th>URL</th>
        <th></th>
        <th>DESCRIÇÃO</th>
    </tr>
    <tr>
        <th>GET</th>
        <th></th>
        <td>/api/Produto</td>
        <th></th>
        <td>Retorna todos os Produtos de todas as Filiais</td>
    </tr>
    <tr>
        <th>POST</th>
        <th></th>
        <td>/api/Produto</td>
        <th></th>
        <td>Cria um novo Produto</td>
    </tr>
</table>

### Exemplo: inserindo um novo Produto
<html>
<code>
{<br>
 "idFilial": 2,<br>
 "quantidade": 1000,<br>
 "descricao": "Arroz",<br>
}
</code>
</html>



















## <u>Filial</u> (localhost:9000)
<table>
    <tr>
        <th>MÉTODO</th>
        <th></th>
        <th>URL</th>
        <th></th>
        <th>DESCRIÇÃO</th>
    </tr>
    <tr>
        <th>GET</th>
        <th></th>
        <td>/api/Filial</td>
        <th></th>
        <td>Retorna a lista de Filiais</td>
    </tr>
    <tr>
        <th>GET</th>
        <th></th>
        <td>/api/Filial/{id}</td>
        <th></th>
        <td>Retorna uma Filial</td>
    </tr>
    <tr>
        <th>POST</th>
        <th></th>
        <td>/api/Filial</td>
        <th></th>
        <td>Cria uma nova Filial</td>
    </tr>
</table>

### Exemplo: inserindo uma nova Filial
<html>
<code>
{<br>
 "idEstoque": 2,<br>
 "nome":"COHAMA"<br>
}
</code>
</html>










## <u>Estoque</u> (localhost:9000)
<table>
    <tr>
        <th>MÉTODO</th>
        <th></th>
        <th>URL</th>
        <th></th>
        <th>DESCRIÇÃO</th>
    </tr>
    <tr>
        <th>GET</th>
        <th></th>
        <td>/api/Estoque</td>
        <th></th>
        <td>Retorna a lista de Estoques</td>
    </tr>
    <tr>
        <th>GET</th>
        <th></th>
        <td>/api/Estoque/{id}</td>
        <th></th>
        <td>Retorna uma Estoque</td>
    </tr>
    <tr>
        <th>POST</th>
        <th></th>
        <td>/api/Estoque</td>
        <th></th>
        <td>Cria um novo Estoque</td>
    </tr>
</table>

### Exemplo: inserindo um novo Estoque
<html>
<code>
{<br>
	"produtos": [<br>
		{<br>
			"idFilial": 2,<br>
			"quantidade": 10,<br>
			"descricao": "Televisão"<br>
		},<br>
		{<br>
			"idFilial": 2,<br>
			"quantidade": 3,<br>
			"descricao": "Fogão"<br>
		}<br>
		]<br>
}<br>
</code>
</html>












## <u>ItemPedidosEstoque</u> (localhost:9000)
<table>
    <tr>
        <th>MÉTODO</th>
        <th></th>
        <th>URL</th>
        <th></th>
        <th>DESCRIÇÃO</th>
    </tr>
    <tr>
        <th>GET</th>
        <th></th>
        <td>/api/ItemPedidosEstoque</td>
        <th></th>
        <td>Retorna a lista de todos os Pedidos</td>
    </tr>
    <tr>
        <th>DELETE</th>
        <th></th>
        <td>/api/PedidoEstoque/{id}</td>
        <th></th>
        <td>Exclui um Pedido pelo id</td>
    </tr>
    <tr>
        <th>POST</th>
        <th></th>
        <td>/api/PedidoEstoque</td>
        <th></th>
        <td>Cria um novo Pedido</td>
    </tr>
</table>

### Exemplo: inserindo um novo Pedido
<html>
<code>
{<br>
	"idFilial": 2,<br>
	"tipo": "entrada",<br>
	"itens": [<br>
 {<br>
 "idFilial": 2,<br>
 "quantidade": 2000,<br>
 "descricao": "Arroz"<br>
 },<br>
 {<br>
	"idFilial": 2,<br>
	"quantidade": 1000,<br>
	"descricao": "Feijao"<br>
 }<br>
 ]
<br>}
</code>
</html>






















## <u>ItemPedidoEstoque</u> (localhost:9000)
<table>
    <tr>
        <th>MÉTODO</th>
        <th></th>
        <th>URL</th>
        <th></th>
        <th>DESCRIÇÃO</th>
    </tr>
    <tr>
        <th>GET</th>
        <th></th>
        <td>/api/ItemPedidoEstoque/{id}</td>
        <th></th>
        <td>Retorna a lista de Produtos de um determinado Pedido</td>
    </tr>
</table>

