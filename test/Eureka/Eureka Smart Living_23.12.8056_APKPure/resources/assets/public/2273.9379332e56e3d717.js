"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[2273,9764],{32273:(x,E,n)=>{n.r(E),n.d(E,{ClientApplicationsPageModule:()=>I});var m=n(96814),g=n(56223),r=n(73582),f=n(70160),C=n(46729),p=n(51141),_=n(56544),v=n(19462),i=n(8873),e=n(65879),l=n(34414),d=n(63999),y=n(9482),A=n(26227),P=n(77935),h=n(59764);function D(t,c){if(1&t){const a=e.EpF();e.TgZ(0,"ion-card",14),e.NdJ("click",function(){e.CHM(a);const s=e.oxw().$implicit,u=e.oxw(2);return e.KtG(u.openPage(s))}),e._UZ(1,"img",15),e.TgZ(2,"p"),e._uU(3),e.ALo(4,"translate"),e.qZA()()}if(2&t){const a=e.oxw().$implicit;e.Udp("opacity",a.isEnabled?1:.3),e.xp6(1),e.Q6J("src",null==a?null:a.img,e.LSH),e.xp6(1),e.Tol(a.textClass?a.textClass:""),e.xp6(1),e.Oqu(e.lcZ(4,6,a.name))}}function H(t,c){if(1&t&&(e.TgZ(0,"ion-col",12),e.YNc(1,D,5,8,"ion-card",13),e.qZA()),2&t){const a=c.$implicit;e.xp6(1),e.Q6J("ngIf",a)}}function Y(t,c){if(1&t&&(e.TgZ(0,"ion-row",10),e.YNc(1,H,2,1,"ion-col",11),e.qZA()),2&t){const a=c.$implicit;e.xp6(1),e.Q6J("ngForOf",a)}}const M=[{path:"",component:(()=>{var t;class c extends _.n{constructor(o,s,u,b,F,z,w,N,U,O,J,T,L,Z,k){super(T,w,u,b,o,J,!1,k,O,L,Z),this.navCtrl=o,this.alertController=u,this.translate=b,this.loadingCtrl=F,this.event=z,this.platform=w,this.navParams=N,this.network=U,this.toastCtrl=O,this.api=T,this.popoverCtrl=Z,this.router=k,this.grid=[,],this.theAppState=i.a,w.ready().then(()=>{this.unauthHandler=()=>{console.log("unauthorized"),this.navCtrl.navigateRoot(p.g6)},C.V0.events.subscribe("unauthorized",this.unauthHandler),this.InitializeHomeScreen()})}ionViewDidEnter(){console.log("ionViewDidEnter ClientApplicationsPage"),C.V0.events.unsubscribe("unauthorized",this.unauthHandler),this.unauthHandler=void 0}InitializeHomeScreen(){console.log("Intializing Management Screen"),this.grid=[,],this.grid[0]=[],this.grid[0][0]={type:"requests",name:"requests",isEnabled:!0,img:v.s.Images.client_requests},this.grid[0][1]={type:"clients",name:"clients",isEnabled:!0,img:v.s.Images.client_applications},this.grid[0][2]={type:"settings",name:"settings",isEnabled:!0,img:v.s.Images.client_settings}}openPage(o){if(console.warn(o),0==o.isEnabled)return;let s=p.Z6;switch(o.type){case"clients":s=p.Z6;break;case"requests":s=p.KO;break;case"settings":s=p.vK}"back"==o.type?this.navCtrl.back():(console.warn(s),this.navCtrl.navigateForward(s,{state:{data:o.param}}).then(u=>{console.log("Navigated...")}))}}return(t=c).\u0275fac=function(o){return new(o||t)(e.Y36(l.SH),e.Y36(l.SH),e.Y36(l.Br),e.Y36(d.sK),e.Y36(l.HT),e.Y36(y.z),e.Y36(l.t4),e.Y36(l.X1),e.Y36(A.Z),e.Y36(l.yF),e.Y36(e.R0b),e.Y36(C.V0),e.Y36(P.Z),e.Y36(l.Dh),e.Y36(f.F0))},t.\u0275cmp=e.Xpm({type:t,selectors:[["client-applications"]],features:[e.qOj],decls:20,vars:6,consts:[["hideBackButton","true",2,"text-align","center","direction","ltr",3,"ngStyle"],[2,"padding","5px"],[2,"text-align","end","float","right","min-width","10px"],["showWhen","android,ios",1,"top-mic-button",2,"vertical-align","bottom",3,"touchstart","touchend"],["name","mic",1,"voice-mic-button"],[1,"top-badge"],[2,"width","40px","float","left","display","block"],["tappable","","component-click","","tabindex","0",1,"top-mic-button",2,"font-size","30px","text-align","center","vertical-align","middle",3,"click"],["name","chevron-back"],["align-items-center","","style","margin-bottom:10px;",4,"ngFor","ngForOf"],["align-items-center","",2,"margin-bottom","10px"],["col-4","","dropzone","true","item-center","",4,"ngFor","ngForOf"],["col-4","","dropzone","true","item-center",""],["ion-item","","tappable","","class","btn-device-grid","style","width:24vw; height:24vw; margin:auto;","item-center","","draggable","true","ondrag","",3,"opacity","click",4,"ngIf"],["ion-item","","tappable","","item-center","","draggable","true","ondrag","",1,"btn-device-grid",2,"width","24vw","height","24vw","margin","auto",3,"click"],[2,"align-items","center","width","75%",3,"src"]],template:function(o,s){1&o&&(e.TgZ(0,"ion-header")(1,"ion-toolbar",0)(2,"div")(3,"div",1)(4,"div",2),e._UZ(5,"connection-warning"),e.TgZ(6,"a",3),e.NdJ("touchstart",function(){return s.longPressStart()})("touchend",function(){return s.PressEnd()}),e._UZ(7,"ion-icon",4),e.TgZ(8,"ion-badge",5),e._uU(9),e.qZA()()(),e.TgZ(10,"div",6)(11,"a",7),e.NdJ("click",function(){return s.goBack()}),e._UZ(12,"ion-icon",8),e.qZA()(),e.TgZ(13,"div")(14,"ion-title"),e._uU(15),e.ALo(16,"translate"),e.qZA()()()()()(),e.TgZ(17,"ion-content")(18,"ion-grid"),e.YNc(19,Y,2,1,"ion-row",9),e.qZA()()),2&o&&(e.xp6(1),e.Q6J("ngStyle",s.theAppState.iontoolbarStyle),e.xp6(8),e.Oqu(s.speech_language_symbol),e.xp6(6),e.Oqu(e.lcZ(16,4,"client-applications")),e.xp6(4),e.Q6J("ngForOf",s.grid))},dependencies:[m.sg,m.O5,m.PC,r.yp,r.PM,r.wI,r.W2,r.jY,r.Gu,r.gu,r.Nd,r.wd,r.sr,h.T,d.X$]}),c})()}];let S=(()=>{var t;class c{}return(t=c).\u0275fac=function(o){return new(o||t)},t.\u0275mod=e.oAB({type:t}),t.\u0275inj=e.cJS({imports:[f.Bz.forChild(M),f.Bz]}),c})();var B=n(23934);let I=(()=>{var t;class c{}return(t=c).\u0275fac=function(o){return new(o||t)},t.\u0275mod=e.oAB({type:t}),t.\u0275inj=e.cJS({imports:[m.ez,g.u5,r.Pc,S,d.aw,B.o]}),c})()},59764:(x,E,n)=>{n.d(E,{T:()=>C});var m=n(15861),g=n(65879),r=n(56223),f=n(28662);let C=(()=>{var p;class _{mouseDownEventHandler(i){i.stopImmediatePropagation(),i.preventDefault()}keyEventHandler(i){var e=this;return(0,m.Z)(function*(){if(i.stopImmediatePropagation(),i.preventDefault(),"Enter"==i.key||" "==i.key){var l;let d=null===(l=document.activeElement)||void 0===l?void 0:l.className.toLowerCase();if(d&&(d.indexOf("range-knob-handle")>-1||d.indexOf("range-md")>-1)&&d.indexOf("range-knob-handle")>-1&&(console.log("range-knob-handle"),document.activeElement&&document.activeElement.getAttribute("aria-valuenow"))){let P=document.activeElement.getAttribute("aria-valuenow");if(P){let h=Number.parseFloat(P);if(h||0===h)return console.log("range-knob-handle value change to "+h),void e.model.update.emit(h)}}let y=e.el.nativeElement.nodeName.toLowerCase();const A=yield f.A.getInfo();["button","ion-checkbox","a"].indexOf(y)>-1?"android"!==A.operatingSystem.toLowerCase()&&e.el.nativeElement.click():"!android"!==A.operatingSystem.toLowerCase()&&e.clickOnElement(e.el)}})()}clickOnElement(i){if(document.createEvent){let e=document.createEvent("MouseEvents");e.initMouseEvent("click",!0,!0,window,0,0,0,0,0,!1,!1,!1,!1,0,null),i.nativeElement.dispatchEvent(e)}}mouseDownOnElement(i){let e=new MouseEvent("mousedown",{bubbles:!0,cancelable:!1});i.nativeElement.dispatchEvent(e)}constructor(i,e,l){this.el=i,this.renderer=e,this.model=l,this.eventEmitter=new g.vpe}ngOnInit(){}}return(p=_).\u0275fac=function(i){return new(i||p)(g.Y36(g.SBq),g.Y36(g.Qsj),g.Y36(r.On))},p.\u0275dir=g.lG2({type:p,selectors:[["","component-click",""]],hostBindings:function(i,e){1&i&&g.NdJ("mousedown",function(d){return e.mouseDownEventHandler(d)})("keypress",function(d){return e.keyEventHandler(d)})},outputs:{eventEmitter:"eventEmitter"},features:[g._Bn([r.On])]}),_})()}}]);