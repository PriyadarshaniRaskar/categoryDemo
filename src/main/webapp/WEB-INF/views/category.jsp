<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<table class="table col-sm-5">
<thead>
	<th>Name</th>
	<th>Description</th>
	</thead>
	<tbody>
	<c:forEach items="${listOfCategories}" var="category">
		<tr>
			<td>${category.name}</td>
			<td>${category.description}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
