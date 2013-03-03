var onLoad = function(){
	document.addEventListener("deviceready", deviceReady, false);
}

var deviceReady = function(){
	document.addEventListener("backbutton", exitCordova, false);
	window.plugins.toast.longToast('device is ready, back button will exit and return to native app');
}

var exitCordova = function(){
	navigator.app.exitApp();
}