

$(document).ready(function(){
	
	$('.nBtn, .table .eBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		var text = $(this).text();
		
		if(text == "Edit"){
			$.get(href, function(country, status){
				$('.myForm #id').val(country.id);
				$('.myForm #name').val(country.name);
				$('.myForm #capital').val(country.capital);
			});
			$('.myForm #myModal').modal();
		} else {
			$('.myForm #id').val('');
			$('.myForm #name').val('');
			$('.myForm #capital').val('');
			$('.myForm #myModal').modal();
		}
	});
	
	
	$('.table .delBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#confirmModal #delRef').attr('href',href);
		$('#confirmModal').modal();
	})

});