$(document).ready(function() {

	  //Wczytanie listy książek zaraz po załadowaniu strony
	  getHomeworExcerciseList();

	  /*
	   * POBIERANIE I WYSWIETLANIE KSIAZEK Z BAZY
	   */
	  function getHomeworExcerciseList() {
	    var url = "http://localhost:8080/KnowlegdeManagementSystem/homework/all";
	    ajaxCaller(url, getCallBack);
	  }

	  //funkcja callbackowa wyswietlania informacji o ksiazce
	  function getCallBack(result) {
	    //czyszczenie starej zawartosci diva
	    $('#getAll').html('');
	    for (var i = 0; i < result.length; i++) {

	      var button1 = $('<button>');
	      button1.text('usuń');
	      button1.attr('data-id', $(result).eq(i).attr('id'));
	      button1.addClass('delButton');

	      var divTitle = $('<div>').html(result[i].title + "&nbsp&nbsp");
	      divTitle.addClass('title');
	      divTitle.attr('data-id', $(result).eq(i).attr('id'));

	      var divEmpty = $('<div><p>');
	      divEmpty.addClass('empty');
	      divEmpty.html('<br>');

	      var newDiv = $('<div>');
	      newDiv.addClass('book');
	      newDiv.attr('id', $(result).eq(i).attr('id'));
	      newDiv.append(divTitle);
	      newDiv.append(button1);
	      newDiv.append(divEmpty);

	      //dodawanie nowej zawartosci diva
	      $('#getAll').append(newDiv);
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