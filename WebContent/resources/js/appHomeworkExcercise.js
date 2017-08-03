$(document).ready(function() {

	  //Wczytanie listy zadan domowych zaraz po załadowaniu strony
	  getHomeworExcerciseList();

	  /*
	   * POBIERANIE I WYSWIETLANIE KSIAZEK Z BAZY
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