$(document).ready(function() {

	  //Wczytanie listy zadan domowych zaraz po załadowaniu strony
	  getHomeworExcerciseList();

	  /*
	   * POBIERANIE I WYSWIETLANIE LISTY ZADAŃ DOMOWYCH Z BAZY Z BAZY
	   */
	  function getHomeworExcerciseList() {
	    var url = "http://localhost:8080/KnowlegdeManagementSystem/homework/all";
	    ajaxCaller(url, getCallBack);
	  }

		// funkcja callbackowa wyswietlania informacji o zadaniach domowych
		function getCallBack(result) {
			// czyszczenie starej zawartosci diva
		    $('#getAllHomeworkExcercise').html('');
		    // wczytywanie listy zadan
			for (var i = 0; i < result.length; i++) {
				var newLi = $('<li>').html("<b>" + result[i].title + "</b></a>");
				// dodawanie nowej zawartosci diva
				$('#getAllHomeworkExcercise').append(newLi);
			}
		}
		
		  /*
		   * EVENT DODAWANIA ZADANIA Z FORMULARZA
		   */
		  $('[type="submit"]').on('click', function(event) {
		    event.preventDefault();
		    var form = $('form');
		    var json = {
		      "title": form.find('textarea[name="title"]').val(),
		      "description": form.find('textarea[name="description"]').val()
		    };
		    url = "http://localhost:8080/KnowlegdeManagementSystem/homework/add";
		    ajaxCaller(url, addCallBack, 'POST', json);

		  })

		  //add Call Back. czyszczenie formularza i wczytywanie nowej listy ksiazek
		  function addCallBack(){
			getHomeworExcerciseList();
		    $('form').find('textarea[type="text"]').each(function(){
		    $(this).val('');
		    });
		    
		  }
	
	
	
  /*
   * AJAX CALLER
   */
  function ajaxCaller(url, callback, method, json, empty) {
    $.ajax({
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        url: url,
        type: method || 'GET',
        data: JSON.stringify(json)
      })
      .done(function(result) {
        callback(result, empty);
      });
  }

})