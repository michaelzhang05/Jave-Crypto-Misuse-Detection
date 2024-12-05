
Put settings.json file in current folder `external_settings`
It can only contain valid json format otherwise your settings will be ignored.
This will only work for `browser` app.

dashboard_mode and dashboard_id work together.
username and password also work together.
remember_me will try to login to the default selected box.
hide_ui_langauge option will hide the settings to change the language.

Some supported data example:

{
  "dashboard_mode":true,
  "dashboard_id":2,
  "username":"zeeshan",
  "password":"zeeshan",
  "remember_me":true,
  "hide_ui_language":true
}
