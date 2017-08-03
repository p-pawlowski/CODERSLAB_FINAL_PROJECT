$(document).ready(
		function() {

			// Wczytanie listy konspektów zaraz po załadowaniu strony
			getConspectusList();

			/*
			 * POBIERANIE I WYSWIETLANIE LISTY KONSPEKTOW Z BAZY
			 */
			function getConspectusList() {
				var url = "/KnowlegdeManagementSystem/conspectus/all";
				ajaxCaller(url, getCallBack);
			}

			// funkcja callbackowa wyswietlania informacji o ksiazce
			function getCallBack(result) {
				// czyszczenie starej zawartosci diva
				for (var i = 0; i < result.length; i++) {

					var str = "../conspectus/" + result[i].id;
					var newLi = $('<li>').html(
							"<a href=" + str + ">" + "<b>" + result[i].subject
									+ "</b></a>");
					// dodawanie nowej zawartosci diva
					$('#getAll').append(newLi);
				}
			}
			/*
			 * AJAX CALLER
			 */
			function ajaxCaller(url, callback, method, json, empty) {
				$.ajax({
					headers : {
						'Accept' : 'application/json',
						'Content-Type' : 'application/json'
					},
					url : url,
					type : method || 'GET',
					data : JSON.stringify(json)
				}).done(function(result) {
					callback(result, empty);
				});
			}

		})