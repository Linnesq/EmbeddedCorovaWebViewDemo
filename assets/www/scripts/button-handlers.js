var toastButtonHandler = function(){
	window.plugins.toast.shortToast('Here\'s to you!');
}

var cordovaButtonHandler = function(){
	var message = 'Device Name: ' + device.name;
	message += '\nDevice Model: ' + device.model;
	message += '\nDevice Version (Android): ' + device.version;
	alert(message);
}
