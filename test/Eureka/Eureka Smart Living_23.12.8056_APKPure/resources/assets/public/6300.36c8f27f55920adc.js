"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[6300,9764],{16300:(C,f,t)=>{t.r(f),t.d(f,{ArmManagementPagePageModule:()=>T});var d=t(96814),r=t(56223),i=t(73582),h=t(70160),u=t(8873),e=t(65879),A=t(34414),v=t(59764),l=t(48753),o=t(63999);function c(a,s){1&a&&(e.TgZ(0,"small",10),e._uU(1),e.ALo(2,"translate"),e.qZA()),2&a&&(e.xp6(1),e.hij(" ",e.lcZ(2,1,"validation-required")," "))}function m(a,s){1&a&&(e.TgZ(0,"small",10),e._uU(1),e.ALo(2,"translate"),e.qZA()),2&a&&(e.xp6(1),e.hij(" ",e.lcZ(2,1,"arming-validation")," "))}function M(a,s){1&a&&(e.TgZ(0,"small",10),e._uU(1),e.ALo(2,"translate"),e.qZA()),2&a&&(e.xp6(1),e.hij(" ",e.lcZ(2,1,"validation-required")," "))}function y(a,s){1&a&&(e.TgZ(0,"small",10),e._uU(1),e.ALo(2,"translate"),e.qZA()),2&a&&(e.xp6(1),e.hij(" ",e.lcZ(2,1,"arming-validation")," "))}function Z(a,s){if(1&a&&(e.TgZ(0,"small",10),e._uU(1),e.ALo(2,"translate"),e.qZA()),2&a){const p=e.oxw();e.xp6(1),e.AsE(" ",e.lcZ(2,2,"arming-pin-validation"),"",p.armingPinCode.length," ")}}const b=[{path:"",component:(()=>{var a;class s{constructor(g,n){this.navCtrl=g,this.navParams=n,this.theAppState=u.a,this.armingDelay=0,this.armingBreachedDelay=0,this.armingPinCode="****",this.loadedProperly=!1}GetArmSettings(g=!1){u.a.DefaultController&&u.a.DefaultController.GetSettings().then(n=>{n&&n.body&&n.body.result&&n.body.result.ArmingDelay&&n.body.result.ArmingBreachedDelay&&n.body.result.ArmingPinCode&&(this.armingDelay=Number.parseFloat(n.body.result.ArmingDelay.toString()),this.armingBreachedDelay=Number.parseFloat(n.body.result.ArmingBreachedDelay.toString()),this.armingPinCode=n.body.result.ArmingPinCode.toString(),this.loadedProperly=!0,g&&this.goBack())})}SetArmSettings(g,n){this.loadedProperly=!1,u.a.DefaultController.SetSettings({settings:{[g]:n.toString()}}).then(()=>{this.GetArmSettings()})}UpdateArmingSettings(g){this.SetArmSettings("ArmingDelay",this.armingDelay),this.SetArmSettings("ArmingBreachedDelay",this.armingBreachedDelay),this.SetArmSettings("ArmingPinCode",this.armingPinCode)}ionViewDidEnter(){console.log("ionViewDidEnter ArmManagementPage"),this.GetArmSettings()}goBack(g=!1){g?this.navCtrl.navigateRoot("main"):this.navCtrl.pop()}ngOnInit(){this.ionViewDidEnter()}}return(a=s).\u0275fac=function(g){return new(g||a)(e.Y36(A.SH),e.Y36(A.X1))},a.\u0275cmp=e.Xpm({type:a,selectors:[["arm-management-page"]],decls:57,vars:37,consts:[["hideBackButton","true",2,"text-align","center","direction","ltr",3,"ngStyle"],[2,"padding","5px"],[2,"width","40px","float","left","display","block"],["tappable","","component-click","","tabindex","0",1,"top-mic-button",2,"font-size","30px","text-align","center","vertical-align","middle",3,"click"],["name","chevron-back"],["padding",""],["type","number","min","0","max","600","pattern","\\d+",3,"disabled","ngModel","ngModelChange"],["style","color:red;font-weight:bold;",4,"ngIf"],["type","text","inputmode","numeric","pattern","\\d+",2,"-webkit-text-security","disc",3,"disabled","ngModel","ngModelChange"],[1,"full-primary-button",3,"disabled","click"],[2,"color","red","font-weight","bold"]],template:function(g,n){1&g&&(e.TgZ(0,"ion-header")(1,"ion-toolbar",0)(2,"div")(3,"div",1)(4,"div",2)(5,"a",3),e.NdJ("click",function(){return n.goBack()}),e._UZ(6,"ion-icon",4),e.qZA()(),e.TgZ(7,"div")(8,"ion-title"),e._uU(9),e.ALo(10,"translate"),e.qZA()()()()()(),e.TgZ(11,"ion-content",5)(12,"div")(13,"span"),e._uU(14),e.ALo(15,"translate"),e.qZA(),e._UZ(16,"br"),e.TgZ(17,"ion-input",6),e.NdJ("ngModelChange",function(P){return n.armingDelay=P}),e.qZA(),e.TgZ(18,"small"),e._uU(19),e.ALo(20,"translate"),e.qZA(),e._UZ(21,"br"),e.YNc(22,c,3,3,"small",7),e._UZ(23,"br"),e.YNc(24,m,3,3,"small",7),e._UZ(25,"br"),e.qZA(),e._UZ(26,"br"),e.TgZ(27,"div")(28,"span"),e._uU(29),e.ALo(30,"translate"),e.qZA(),e._UZ(31,"br"),e.TgZ(32,"ion-input",6),e.NdJ("ngModelChange",function(P){return n.armingBreachedDelay=P}),e.qZA(),e.TgZ(33,"small"),e._uU(34),e.ALo(35,"translate"),e.qZA(),e._UZ(36,"br"),e.YNc(37,M,3,3,"small",7),e._UZ(38,"br"),e.YNc(39,y,3,3,"small",7),e._UZ(40,"br"),e.qZA(),e._UZ(41,"br"),e.TgZ(42,"div")(43,"span"),e._uU(44),e.ALo(45,"translate"),e.qZA(),e._UZ(46,"br"),e.TgZ(47,"ion-input",8),e.NdJ("ngModelChange",function(P){return n.armingPinCode=P}),e.qZA(),e.TgZ(48,"small"),e._uU(49),e.ALo(50,"translate"),e.qZA(),e._UZ(51,"br"),e.YNc(52,Z,3,4,"small",7),e._UZ(53,"br"),e.qZA(),e.TgZ(54,"ion-button",9),e.NdJ("click",function(){return n.UpdateArmingSettings()}),e._uU(55),e.ALo(56,"translate"),e.qZA()()),2&g&&(e.xp6(1),e.Q6J("ngStyle",n.theAppState.iontoolbarStyle),e.xp6(8),e.Oqu(e.lcZ(10,21,"arm-management")),e.xp6(5),e.hij(" ",e.lcZ(15,23,"arming-delay")," "),e.xp6(3),e.Q6J("disabled",!n.loadedProperly)("ngModel",n.armingDelay),e.xp6(2),e.Oqu(e.lcZ(20,25,"default-arming-delay-description")),e.xp6(3),e.Q6J("ngIf",!n.armingDelay),e.xp6(2),e.Q6J("ngIf",!(n.armingDelay>=0&&n.armingDelay<=600)),e.xp6(5),e.hij(" ",e.lcZ(30,27,"arming-breached-delay")," "),e.xp6(3),e.Q6J("disabled",!n.loadedProperly)("ngModel",n.armingBreachedDelay),e.xp6(2),e.Oqu(e.lcZ(35,29,"default-arming-breach-delay-description")),e.xp6(3),e.Q6J("ngIf",!n.armingBreachedDelay),e.xp6(2),e.Q6J("ngIf",!(n.armingBreachedDelay>=0&&n.armingBreachedDelay<=600)),e.xp6(5),e.hij(" ",e.lcZ(45,31,"arming-pinCode")," "),e.xp6(3),e.Q6J("disabled",!n.loadedProperly)("ngModel",n.armingPinCode),e.xp6(2),e.Oqu(e.lcZ(50,33,"default-arming-pin-code-description")),e.xp6(3),e.Q6J("ngIf",n.armingPinCode.length<4||n.armingPinCode.length>6),e.xp6(2),e.Q6J("disabled",!(n.armingDelay&&n.armingBreachedDelay&&n.armingPinCode&&n.armingDelay>=0&&n.armingDelay<=600&&n.armingBreachedDelay>=0&&n.armingBreachedDelay<=600&&n.armingPinCode.length>=4&&n.armingPinCode.length<=6)),e.xp6(1),e.Oqu(e.lcZ(56,35,"save")))},dependencies:[d.O5,d.PC,r.JJ,r.c5,r.On,i.YG,i.W2,i.Gu,i.gu,i.pK,i.wd,i.sr,i.as,i.j9,i.yf,i.Uj,v.T,l.c,o.X$]}),s})()}];let E=(()=>{var a;class s{}return(a=s).\u0275fac=function(g){return new(g||a)},a.\u0275mod=e.oAB({type:a}),a.\u0275inj=e.cJS({imports:[h.Bz.forChild(b),h.Bz]}),s})();var U=t(23934);let T=(()=>{var a;class s{}return(a=s).\u0275fac=function(g){return new(g||a)},a.\u0275mod=e.oAB({type:a}),a.\u0275inj=e.cJS({imports:[d.ez,r.u5,i.Pc,E,o.aw,U.o,r.u5,r.UX]}),s})()},59764:(C,f,t)=>{t.d(f,{T:()=>u});var d=t(15861),r=t(65879),i=t(56223),h=t(28662);let u=(()=>{var e;class A{mouseDownEventHandler(l){l.stopImmediatePropagation(),l.preventDefault()}keyEventHandler(l){var o=this;return(0,d.Z)(function*(){if(l.stopImmediatePropagation(),l.preventDefault(),"Enter"==l.key||" "==l.key){var c;let m=null===(c=document.activeElement)||void 0===c?void 0:c.className.toLowerCase();if(m&&(m.indexOf("range-knob-handle")>-1||m.indexOf("range-md")>-1)&&m.indexOf("range-knob-handle")>-1&&(console.log("range-knob-handle"),document.activeElement&&document.activeElement.getAttribute("aria-valuenow"))){let Z=document.activeElement.getAttribute("aria-valuenow");if(Z){let _=Number.parseFloat(Z);if(_||0===_)return console.log("range-knob-handle value change to "+_),void o.model.update.emit(_)}}let M=o.el.nativeElement.nodeName.toLowerCase();const y=yield h.A.getInfo();["button","ion-checkbox","a"].indexOf(M)>-1?"android"!==y.operatingSystem.toLowerCase()&&o.el.nativeElement.click():"!android"!==y.operatingSystem.toLowerCase()&&o.clickOnElement(o.el)}})()}clickOnElement(l){if(document.createEvent){let o=document.createEvent("MouseEvents");o.initMouseEvent("click",!0,!0,window,0,0,0,0,0,!1,!1,!1,!1,0,null),l.nativeElement.dispatchEvent(o)}}mouseDownOnElement(l){let o=new MouseEvent("mousedown",{bubbles:!0,cancelable:!1});l.nativeElement.dispatchEvent(o)}constructor(l,o,c){this.el=l,this.renderer=o,this.model=c,this.eventEmitter=new r.vpe}ngOnInit(){}}return(e=A).\u0275fac=function(l){return new(l||e)(r.Y36(r.SBq),r.Y36(r.Qsj),r.Y36(i.On))},e.\u0275dir=r.lG2({type:e,selectors:[["","component-click",""]],hostBindings:function(l,o){1&l&&r.NdJ("mousedown",function(m){return o.mouseDownEventHandler(m)})("keypress",function(m){return o.keyEventHandler(m)})},outputs:{eventEmitter:"eventEmitter"},features:[r._Bn([i.On])]}),A})()},48753:(C,f,t)=>{t.d(f,{c:()=>r});var d=t(65879);let r=(()=>{var i;class h{constructor(e){this.elementRef=e}ngOnInit(){this.elementRef.nativeElement.classList.add("ion-padding")}}return(i=h).\u0275fac=function(e){return new(e||i)(d.Y36(d.SBq))},i.\u0275dir=d.lG2({type:i,selectors:[["","padding",""]]}),h})()}}]);