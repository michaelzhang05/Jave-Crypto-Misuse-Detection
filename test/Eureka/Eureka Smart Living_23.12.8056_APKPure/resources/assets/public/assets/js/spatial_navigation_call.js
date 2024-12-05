var testJS = "hello from spatial";
window.addEventListener('load', function () {

  // Initialize
  SpatialNavigation.init();

  // Define the navigable elements.
  SpatialNavigation.add({
    selector: '.focusable'
  });

  // Add 'tabindex="-1"' to "currently-existing" navigable elements. It's
  // just a helper and is optional since you can actually add "tabindex"
  // by yourself.
  //
  // Note: If a new navigable element is appended to DOM tree afterwards,
  // you may need to call this method again.
  SpatialNavigation.makeFocusable();

  // Focus the first navigable element.
  SpatialNavigation.focus();
});
