$(document).ready(function() {

	var button = $('.objectives').find('.addButton');
	button.on('click', function() {		
		event.preventDefault();
		var objective = $('<li>');
		objective.addClass('li1');
		objective.html('<textarea id="objectives" name="objectives" type="text" value=""/> <button class="btn delButton">Usuń</button>');
		$('.objectives').find('ul').append(objective);
	})
	
	var buttonMaterials = $('.materials').find('.addButton');
		buttonMaterials.on('click', function() {		
		event.preventDefault();
		var material = $('<li>');
		material.addClass('li1');
		material.html('<textarea id="materials" name="materials" type="text" value=""/> <button class="btn delButton">Usuń</button>');
		$('.materials').find('ul').append(material);
	})
	
	var buttonMethods = $('.methods').find('.addButton');
		buttonMethods.on('click', function() {		
		event.preventDefault();
		var method = $('<li>');
		method.addClass('li1');
		method.html('<textarea id="methods" name="methods" type="text" value=""/> <button class="btn delButton">Usuń</button>');
		$('.methods').find('ul').append(method);
	})
	
	var buttonScenarioIntroduction = $('.scenarioIntroduction').find('.addButton');
		buttonScenarioIntroduction.on('click', function() {		
		event.preventDefault();
		var scenarioIntroduction = $('<li>');
		scenarioIntroduction.addClass('li2');
		scenarioIntroduction.html('<textarea id="scenarioIntroduction" name="scenarioIntroduction" type="text" value=""/> <button class="btn delButton">Usuń</button>');
		$('.scenarioIntroduction').find('ul').append(scenarioIntroduction);
	})
	
	var buttonScenarioMain = $('.scenarioMain').find('.addButton');
		buttonScenarioMain.on('click', function() {		
		event.preventDefault();
		var scenarioMain = $('<li>');
		scenarioMain.addClass('li2');
		scenarioMain.html('<textarea id="scenarioMain" name="scenarioMain" type="text" value=""/> <button class="btn delButton">Usuń</button>');
		$('.scenarioMain').find('ul').append(scenarioMain);
	})
	
	var buttonScenarioSummary = $('.scenarioSummary').find('.addButton');
		buttonScenarioSummary.on('click', function() {		
		event.preventDefault();
		var scenarioSummary = $('<li>');
		scenarioSummary.addClass('li2');
		scenarioSummary.html('<textarea id="scenarioSummary" name="scenarioSummary" type="text" value=""/> <button class="btn delButton">Usuń</button>');
		$('.scenarioSummary').find('ul').append(scenarioSummary);
	})
	
	
	$('body').on('click', '.delButton', function() {
		event.preventDefault();
		$(this).parent().remove();
		
	})
	
})