window.nativeUIEnabled = true;
window.firstLoad = true;
function initializeApp() {
  //if (nativeUIEnabled) {
  //  // Surround the WebView with native UI
  //  ace.load("native://app.xaml", function (page) {
  //    // Replace the root UI with the loaded native page
  //    ace.getHostPage().setContent(page);

  //    // Reparent the WebView inside the native page
  //    page.setContent(ace.getHostWebView());

  //    // Save the page for changing its title later
  //    window.nativePage = page;
  //  });
  //}
  console.log("ace");
  console.log(ace);
  if (ace.platform == "Android") {
    setupWidget();
  }
}


function setupWidget() {
  // Handle the app being resumed by a widget click:
  ace.addEventListener("android.intentchanged", checkForWidgetActivation);

  ace.android.appWidget.clear();

  for (var i = 0; i < 10; i++) {
    ace.android.appWidget.add("Item with index " + i);
  }
}

function checkForWidgetActivation() {
  if (ace.platform != "Android") {
    return;
  }

  ace.android.getIntent().invoke("getIntExtra", "widgetSelectionIndex", -1, function (value) {
    // value is the index of the item clicked
    // or -1 if no item has been clicked
  });
}


(function () {
  "use strict";
  console.log('ready');
  document.addEventListener('deviceready', onDeviceReady.bind(this), false);

  function onDeviceReady() {
    // Handle the Cordova pause and resume events
    document.addEventListener('pause', onPause.bind(this), false);
    document.addEventListener('resume', onResume.bind(this), false);
    console.log('ready');
    //
    // Workaround for iOS Ionic UI. Always use native navbar + tabs:
    //
    //if (ace.platform == "iOS" && !window.nativeUIEnabled) {
    //  // Surround the WebView with native UI
    //  ace.load("native://app.xaml", function (page) {
    //    // Replace the root UI with the loaded native page
    //    ace.getHostPage().setContent(page);

    //    // Reparent the WebView inside the native page
    //    page.setContent(ace.getHostWebView());

    //    // Save the page for changing its title later
    //    window.nativePage = page;
    //  });
    //}

    initializeApp();
  };

  function onPause() {
    // This application has been suspended. Save application state here.
  };

  function onResume() {
    // This application has been reactivated. Restore application state here.
  };
})();
