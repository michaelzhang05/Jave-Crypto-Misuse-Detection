"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[2950],{72950:(C,f,n)=>{n.r(f),n.d(f,{SelectFilePageModule:()=>R});var s=n(96814),r=n(56223),e=n(73582),d=n(70160),m=n(15861),g=n(28002),O=n(17229),u=n(8873),A=n(82576),i=n(65879),S=n(34414),P=n(88446),v=n(63999),F=n(59764),y=n(48753);function Z(t,l){if(1&t&&(i.TgZ(0,"ion-select-option",12),i._uU(1),i.qZA()),2&t){const c=l.$implicit;i.s9C("value",c.value),i.xp6(1),i.Oqu(c.name)}}const M=[{path:"",component:(()=>{var t;class l{conditionCallback(o){return(0,m.Z)(function*(){})()}constructor(o,a,h,p,x){if(this.navCtrl=o,this.navProv=a,this.translate=h,this.router=p,this.locationStrategy=x,this.isEditing=!1,this.fileCondition=0,this.theAppState=u.a,this.file_conditions=[{selected:!0,value:0,name:this.translate.instant("exist")},{selected:!1,value:1,name:this.translate.instant("not-exist")}],this.descriptionGen=new A.q(this.translate),this.router.getCurrentNavigation().extras.state){const N=this.router.getCurrentNavigation().extras.state;this.navParams=N.data,console.log(this.navParams)}this.navProv.pagesToLoad.push(this),this.isEditing=this.navParams.edit,this.ROAEO=this.navParams.ROAEO,this.condition=this.ROAEO.roomOccupancyActionCondition?this.ROAEO.roomOccupancyActionCondition:this.ROAEO.roomOccupancyActionCondition=new g.gP,this.condition?(this.fileCondition=Number(this.condition.fileOperator),this.fileName=this.condition.fileName,this.condition.conditionType=O.oS.File):this.fileCondition=0,this.conditionCallback=this.navParams.callback}ionViewDidLoad(){console.log("ionViewDidLoad SelectFilePage")}AddCondition(){var o=this;this.condition||(this.condition=new g.gP),this.condition.fileOperator=Number(this.fileCondition),this.condition.fileName=this.fileName,this.condition.conditionType=O.oS.File,this.ROAEO.roomOccupancyActionCondition=this.condition,console.log(this.condition),u.a.ROAEO=this.ROAEO,u.a.ROAEO.roomOccupancyActionCondition.description=this.descriptionGen.GetConditionDescription(u.a.ROAEO.roomOccupancyActionCondition),u.a.oconditionCallback(this.ROAEO).then((0,m.Z)(function*(){o.isEditing||o.locationStrategy.historyGo(-2)}))}parseFileConditionsScene(){console.log(this.fileCondition,"this.fileCondition"),console.log(this.condition.fileOperator,"this.condition.fileOperator"),this.condition.fileOperator=Number(this.fileCondition)}compareWith(o,a){return String(o)==String(a)}goBack(){this.navCtrl.back()}}return(t=l).\u0275fac=function(o){return new(o||t)(i.Y36(S.SH),i.Y36(P.Y),i.Y36(v.sK),i.Y36(d.F0),i.Y36(s.S$))},t.\u0275cmp=i.Xpm({type:t,selectors:[["select-file"]],decls:28,vars:17,consts:[["hideBackButton","true",2,"text-align","center","direction","ltr",3,"ngStyle"],[2,"padding","5px"],[2,"text-align","end","float","right","min-width","10px"],[2,"width","40px","float","left","display","block"],["tappable","","component-click","","tabindex","0",1,"top-mic-button",2,"font-size","30px","text-align","center","vertical-align","middle",3,"click"],["name","chevron-back"],["padding",""],[1,"dark-control",2,"margin","3px 8px","text-align","start","height","34px",3,"ngModel","compareWith","ngModelChange"],[3,"value",4,"ngFor","ngForOf"],["required","",3,"ngModel","ngModelChange"],["TCGV","ngModel"],[1,"full-primary-button","full-button",3,"click"],[3,"value"]],template:function(o,a){1&o&&(i.TgZ(0,"ion-header")(1,"ion-toolbar",0)(2,"div",1),i._UZ(3,"div",2),i.TgZ(4,"div",3)(5,"a",4),i.NdJ("click",function(){return a.goBack()}),i._UZ(6,"ion-icon",5),i.qZA()(),i.TgZ(7,"div")(8,"ion-title"),i._uU(9),i.ALo(10,"translate"),i.qZA()()()()(),i.TgZ(11,"ion-content",6)(12,"ion-item")(13,"ion-label"),i._uU(14),i.ALo(15,"translate"),i.qZA(),i.TgZ(16,"ion-select",7),i.NdJ("ngModelChange",function(p){return a.fileCondition=p})("ngModelChange",function(){return a.parseFileConditionsScene()}),i.YNc(17,Z,2,2,"ion-select-option",8),i.qZA()(),i.TgZ(18,"ion-item")(19,"ion-label"),i._uU(20),i.ALo(21,"translate"),i.qZA(),i.TgZ(22,"ion-input",9,10),i.NdJ("ngModelChange",function(p){return a.fileName=p}),i.qZA()(),i._UZ(24,"br"),i.TgZ(25,"ion-button",11),i.NdJ("click",function(){return a.AddCondition()}),i._uU(26),i.ALo(27,"translate"),i.qZA()()),2&o&&(i.xp6(1),i.Q6J("ngStyle",a.theAppState.iontoolbarStyle),i.xp6(8),i.Oqu(i.lcZ(10,9,"file-condition")),i.xp6(5),i.Oqu(i.lcZ(15,11,"file-condition")),i.xp6(2),i.Q6J("ngModel",a.fileCondition)("compareWith",a.compareWith),i.xp6(1),i.Q6J("ngForOf",a.file_conditions),i.xp6(3),i.Oqu(i.lcZ(21,13,"file-name")),i.xp6(2),i.Q6J("ngModel",a.fileName),i.xp6(4),i.hij(" ",i.lcZ(27,15,"add")," "))},dependencies:[s.sg,s.PC,r.JJ,r.Q7,r.On,e.YG,e.W2,e.Gu,e.gu,e.pK,e.Ie,e.Q$,e.t9,e.n0,e.wd,e.sr,e.QI,e.j9,F.T,y.c,v.X$],styles:[".full-button[_ngcontent-%COMP%]{width:100%;display:block}"]}),l})()}];let T=(()=>{var t;class l{}return(t=l).\u0275fac=function(o){return new(o||t)},t.\u0275mod=i.oAB({type:t}),t.\u0275inj=i.cJS({imports:[d.Bz.forChild(M),d.Bz]}),l})();var E=n(23934);let R=(()=>{var t;class l{}return(t=l).\u0275fac=function(o){return new(o||t)},t.\u0275mod=i.oAB({type:t}),t.\u0275inj=i.cJS({imports:[s.ez,r.u5,e.Pc,T,v.aw.forChild(),E.o]}),l})()},48753:(C,f,n)=>{n.d(f,{c:()=>r});var s=n(65879);let r=(()=>{var e;class d{constructor(g){this.elementRef=g}ngOnInit(){this.elementRef.nativeElement.classList.add("ion-padding")}}return(e=d).\u0275fac=function(g){return new(g||e)(s.Y36(s.SBq))},e.\u0275dir=s.lG2({type:e,selectors:[["","padding",""]]}),d})()}}]);