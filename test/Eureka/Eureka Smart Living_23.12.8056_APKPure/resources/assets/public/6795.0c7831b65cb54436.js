"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[6795],{16795:(Y,x,c)=>{c.r(x),c.d(x,{DelayOrRevertPageModule:()=>A});var O=c(96814),u=c(56223),l=c(73582),P=c(70160),M=c(15861),b=c(82576),s=c(8873),t=c(65879),C=c(34414),f=c(88446),_=c(63999),v=c(59764);function y(a,p){if(1&a){const g=t.EpF();t.TgZ(0,"ion-row")(1,"ion-col")(2,"ion-label",12),t._uU(3),t.ALo(4,"translate"),t.qZA(),t.TgZ(5,"ion-select",13),t.NdJ("ngModelChange",function(o){t.CHM(g);const i=t.oxw();return t.KtG(i.action.action.revert=o)})("ngModelChange",function(){t.CHM(g);const o=t.oxw();return t.KtG(o.Update())}),t.TgZ(6,"ion-select-option",14),t._uU(7),t.ALo(8,"translate"),t.qZA(),t.TgZ(9,"ion-select-option",15),t._uU(10),t.ALo(11,"translate"),t.qZA()()()()}if(2&a){const g=t.oxw();t.xp6(3),t.Oqu(t.lcZ(4,5,"revert")),t.xp6(2),t.Q6J("compareWith",g.compareWith)("ngModel",g.action.action.revert),t.xp6(2),t.Oqu(t.lcZ(8,7,"no")),t.xp6(3),t.Oqu(t.lcZ(11,9,"yes"))}}const k=[{path:"",component:(()=>{var a;class p{constructor(e,o,i,n,d,r,m,h,Z){this.navCtrl=e,this.navProv=o,this.pickerCtrl=n,this.changeDetector=d,this.router=r,this.navParams=m,this.modalConroller=h,this.locationStrategy=Z,this.revertAllowed=!1,this.pagesStackToPop=0,this._DELAY_HMS="00:00:00",this.selectedHours=0,this.selectedMinutes=0,this.selectedSeconds=1,this.selectedTime="00:00:00",this.currentDate=new Date,this.selectedDay=this.currentDate.getDate(),this.selectedMonth=this.currentDate.getMonth()+1,this.selectedYear=this.currentDate.getFullYear(),this.selectedAt_iso=this.currentDate.toISOString(),this.time_ms=0,this.theAppState=s.a,this.navParams=s.a.odata,this.pagesStackToPop=this.navParams.pagesStackToPop,this.action=s.a.ROAEO.roomOccupancyActionAction,this.callback=this.navParams.callback,this.revertAllowed=s.a.ROAEO.revertAllowed,this.descGen=new b.q(i),this.action&&this.action.action&&(this.action.action.delayDisplay||(this.action.action.delayDisplay="00:00:00",this.action.action.delay=0))}ionViewDidEnter(){console.log("ionViewDidEnter DelayOrRevertPage")}callback(e){return(0,M.Z)(function*(){})()}save(){var e=this;return(0,M.Z)(function*(){yield e.Update(),s.a.ROAEO.roomOccupancyActionAction=e.action,s.a.ROAEO.revertAllowed=e.revertAllowed,yield s.a.ocallback(s.a.ROAEO).then((0,M.Z)(function*(){e.navCtrl.navigateBack(s.a.navigatebackPage,{state:{data:s.a.navigatebackPageStateData}})}))})()}Update(){this.UpdateOccupancyActionDescription(this.action)}UpdateOccupancyActionDescription(e){this.descGen.UpdateOccupancyActionDescription(this.action)}write(e,o,i){let n=i.split(":");if(3==n.length){let d=parseInt(n[0]),r=parseInt(n[1]),m=parseInt(n[2]);e[o]=m+60*r+3600*d,console.log(i,e[o])}}compareWith(e,o){return String(e)==String(o)}get selectTime(){return this.selectedHours.toString().padStart(2,"0")+":"+this.selectedMinutes.toString().padStart(2,"0")+":"+this.selectedSeconds.toString().padStart(2,"0")}getColumns(e){const o=[];var i,n,d,r,m,h;return e.includes("YYYY")&&o.push({name:"years",options:this.getColumnOptions(2e3,2030),selectedIndex:null!==(i=this.selectedYear-2e3)&&void 0!==i?i:0}),e.includes("MMM")&&o.push({name:"months",options:this.getColumnOptionsMonth(1,12),selectedIndex:null!==(n=this.selectedMonth-1)&&void 0!==n?n:1}),e.includes("DD")&&o.push({name:"days",options:this.getColumnOptionsDay(1,31),selectedIndex:null!==(d=this.selectedDay-1)&&void 0!==d?d:1}),e.includes("HH")&&o.push({name:"hours",options:this.getColumnOptions(0,23),selectedIndex:null!==(r=this.selectedHours)&&void 0!==r?r:0}),e.includes("mm")&&o.push({name:"minutes",options:this.getColumnOptions(0,59),selectedIndex:null!==(m=this.selectedMinutes)&&void 0!==m?m:0}),e.includes("ss")&&o.push({name:"seconds",options:this.getColumnOptions(0,59),selectedIndex:null!==(h=this.selectedSeconds)&&void 0!==h?h:1}),o}getColumnOptions(e,o){const i=[];for(let n=e;n<=o;n++)i.push({text:n.toString().padStart(2,"0"),value:n});return i}formatDayWithSuffix(e){if(e>=11&&e<=13)return e+"th";switch(e%10){case 1:return e+"st";case 2:return e+"nd";case 3:return e+"rd";default:return e+"th"}}getColumnOptionsDay(e,o){const i=[];for(let n=e;n<=o;n++)i.push({text:this.formatDayWithSuffix(n),value:n});return i}getColumnOptionsMonth(e,o){const i=[];return i.push({text:"Jan",value:1}),i.push({text:"Feb",value:2}),i.push({text:"Mar",value:3}),i.push({text:"Apr",value:4}),i.push({text:"May",value:5}),i.push({text:"Jun",value:6}),i.push({text:"Jul",value:7}),i.push({text:"Aug",value:8}),i.push({text:"Sep",value:9}),i.push({text:"Oct",value:10}),i.push({text:"Nov",value:11}),i.push({text:"Dec",value:12}),i}openPicker(e,o,i){var n=this;return(0,M.Z)(function*(){i||(i="HH:mm:ss"),o||(o="00:00:01"),8==o.length&&(n.selectedHours=Number(o.substring(0,2)),n.selectedMinutes=Number(o.substring(3,5)),n.selectedSeconds=Number(o.substring(6,8)),n.selectedDay=Number(n.currentDate.getDate()),n.selectedMonth=Number(n.currentDate.getMonth()+1),n.selectedYear=Number(n.currentDate.getFullYear())),o.length>8&&(n.selectedHours=Number(o.substring(11,13)),n.selectedMinutes=Number(o.substring(14,16)),n.selectedSeconds=Number(o.substring(17,19)),n.selectedDay=Number(o.substring(8,10)),n.selectedMonth=Number(o.substring(5,7)),n.selectedYear=Number(o.substring(0,4))),yield(yield n.pickerCtrl.create({columns:n.getColumns(i),buttons:[{text:"Cancel",role:"cancel"},{text:"Done",role:"done",handler:r=>{n.selectedHours=r.hours.value,n.selectedMinutes=r.minutes.value,n.selectedSeconds=r.seconds.value,r.days&&(n.selectedDay=r.days.value),r.months&&(n.selectedMonth=r.months.value),r.years&&(n.selectedYear=r.years.value),n.selectedTime=n.selectedHours.toString().padStart(2,"0")+":"+n.selectedMinutes.toString().padStart(2,"0")+":"+n.selectedSeconds.toString().padStart(2,"0"),n.selectedAt_iso=n.selectedYear.toString().padStart(4,"0")+"-"+n.selectedMonth.toString().padStart(2,"0")+"-"+n.selectedDay.toString().padStart(2,"0")+"T"+n.selectedTime+"Z",n._DELAY_HMS=n.selectedTime,n.action.action.delayDisplay=n._DELAY_HMS,n.write(n.action.action,"delay",n.action.action.delayDisplay),n.refreshElement()}}]})).present()})()}refreshElement(){this.changeDetector.detectChanges()}updateDelay(){let e=this._DELAY_HMS.split(":"),o=Number.parseInt(e[0]),i=Number.parseInt(e[1]),n=Number.parseInt(e[2]);this.action.action.delay=60*o*60*1e3+60*i*1e3+1e3*n+Number.parseInt(this.time_ms.toString()),console.log(this.action.action.delay)}toString(e,o=0){return e.toString().padStart(0,"0")}updateDelayFromMS(e){let o=e%1e3,i=Math.floor(e/1e3%60),n=Math.floor(e/6e4%60),d=Math.floor(e/36e5%24);this._DELAY_HMS=`${d<10?"0"+d:d}:${n<10?"0"+n:n}:${i<10?"0"+i:i}`,this.time_ms=o}goBack(){this.navCtrl.back()}}return(a=p).\u0275fac=function(e){return new(e||a)(t.Y36(C.SH),t.Y36(f.Y),t.Y36(_.sK),t.Y36(C.up),t.Y36(t.sBO),t.Y36(P.F0),t.Y36(C.X1),t.Y36(C.IN),t.Y36(O.S$))},a.\u0275cmp=t.Xpm({type:a,selectors:[["delay-or-revert"]],decls:33,vars:19,consts:[["hideBackButton","true",2,"text-align","center","direction","ltr",3,"ngStyle"],[2,"padding","5px"],[2,"text-align","end","float","right","min-width","10px"],[2,"width","40px","float","left","display","block"],["tappable","","component-click","","tabindex","0",1,"top-mic-button",2,"font-size","30px","text-align","center","vertical-align","middle",3,"click"],["name","chevron-back"],[1,"ion-padding"],["size","large",1,"select-md",2,"min-width","100%","font-size","1.8rem","text-align","center",3,"click"],["type","number","pattern","\\d*",1,"no-margin",3,"ngModel","ngModelChange"],[2,"font-size","small"],[4,"ngIf"],[1,"full-primary-button","image100",3,"click"],["stacked",""],[2,"text-align","center","min-width","100%",3,"compareWith","ngModel","ngModelChange"],["value","0"],["value","1"]],template:function(e,o){1&e&&(t.TgZ(0,"ion-header")(1,"ion-toolbar",0)(2,"div",1),t._UZ(3,"div",2),t.TgZ(4,"div",3)(5,"a",4),t.NdJ("click",function(){return o.goBack()}),t._UZ(6,"ion-icon",5),t.qZA()(),t.TgZ(7,"div")(8,"ion-title"),t._uU(9),t.ALo(10,"translate"),t.qZA()()()()(),t.TgZ(11,"ion-content",6)(12,"ion-grid")(13,"ion-row")(14,"ion-col")(15,"ion-label"),t._uU(16),t.ALo(17,"translate"),t.qZA(),t.TgZ(18,"ion-button",7),t.NdJ("click",function(){return o.openPicker("_DELAY_HMS",o._DELAY_HMS)}),t._uU(19),t.qZA()()(),t.TgZ(20,"ion-row")(21,"ion-col")(22,"ion-label"),t._uU(23),t.ALo(24,"translate"),t.qZA(),t.TgZ(25,"ion-input",8),t.NdJ("ngModelChange",function(n){return o.action.action.ignoreMotionThreshold=n}),t.qZA(),t.TgZ(26,"i",9),t._uU(27),t.ALo(28,"translate"),t.qZA()()(),t.YNc(29,y,12,11,"ion-row",10),t.qZA(),t.TgZ(30,"ion-button",11),t.NdJ("click",function(){return o.save()}),t._uU(31),t.ALo(32,"translate"),t.qZA()()),2&e&&(t.xp6(1),t.Q6J("ngStyle",o.theAppState.iontoolbarStyle),t.xp6(8),t.Oqu(t.lcZ(10,9,"delay-or-revert")),t.xp6(7),t.Oqu(t.lcZ(17,11,"delay")),t.xp6(3),t.hij(" ",o._DELAY_HMS,""),t.xp6(4),t.hij("",t.lcZ(24,13,"ignore-motion"),"\xa0"),t.xp6(2),t.Q6J("ngModel",o.action.action.ignoreMotionThreshold),t.xp6(2),t.hij(" ",t.lcZ(28,15,"ignore-motion-discription"),""),t.xp6(2),t.Q6J("ngIf",o.revertAllowed),t.xp6(2),t.Oqu(t.lcZ(32,17,"save")))},dependencies:[O.O5,O.PC,u.JJ,u.c5,u.On,l.YG,l.wI,l.W2,l.jY,l.Gu,l.gu,l.pK,l.Q$,l.Nd,l.t9,l.n0,l.wd,l.sr,l.as,l.QI,v.T,_.X$],styles:['.dark-control[_ngcontent-%COMP%], .device-btn[_ngcontent-%COMP%]{max-width:99%;width:98%;height:45px;margin:4px;color:#fff;line-height:2.5}ion-slide[_ngcontent-%COMP%]{overflow:scroll}.list[_ngcontent-%COMP%]   ion-item-sliding[_ngcontent-%COMP%]{background:none;background-color:none}.slide-zoom[_ngcontent-%COMP%]{height:100%;background:none}.property-value-selector[_ngcontent-%COMP%]   .scale_50[_ngcontent-%COMP%]{background:none;box-shadow:none;width:50%}.property-value-selector[_ngcontent-%COMP%]   .scale_90[_ngcontent-%COMP%], .property-value-selector[_ngcontent-%COMP%]   .scale_100[_ngcontent-%COMP%]{background:none;box-shadow:none;width:90%}.ion-datetime[_ngcontent-%COMP%]{padding:0}.select[_ngcontent-%COMP%], .datetime-text[_ngcontent-%COMP%]{min-height:40px;border:1px solid gray;width:98%;display:block;flex:1;line-height:1.5;padding:6px;margin:5px;border-radius:5px;background:linear-gradient(to bottom,rgba(0,0,0,.1) 0%,rgba(0,0,0,.3) 100%);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#a6000000",endColorstr="#00000000",GradientType=0);border:2px solid rgba(150,150,150,.3)}.device-btn[_ngcontent-%COMP%]   img[_ngcontent-%COMP%]{position:absolute;left:4px;right:4px}.badge[_ngcontent-%COMP%]{position:absolute;left:0;bottom:0;height:20px;font-size:small;background:#741598;padding:4px;border-radius:0}.row[_ngcontent-%COMP%]{margin:2px}.full-button[_ngcontent-%COMP%]{width:98%;display:block}.bottom-tag[_ngcontent-%COMP%]{border-bottom-right-radius:10px;width:250px;height:36px;line-height:2}.bottom-tag[_ngcontent-%COMP%]   *[_ngcontent-%COMP%], .bottom-tag[_ngcontent-%COMP%]   .button-clear-md[_ngcontent-%COMP%]{color:#fff}.condition-design[_ngcontent-%COMP%]{background:#182735;text-align:start;margin:3px 7px 0}.trigger-design[_ngcontent-%COMP%]{border:4px;margin-top:5px;padding-bottom:10px;background-color:#5353534d;box-shadow:1px 1px 3px #333;border-radius:3px}.color-tag[_ngcontent-%COMP%]{min-width:20px;display:inline-block;vertical-align:middle}.trigger-tag[_ngcontent-%COMP%]{color:#228b22}.full-label[_ngcontent-%COMP%]{white-space:normal!important;line-height:1.5}.device-tag[_ngcontent-%COMP%]{color:#00c8ff}.room-tag[_ngcontent-%COMP%]{color:tomato;font-size:smaller}.scroll-content[_ngcontent-%COMP%]{padding:2px!important}.property-tag[_ngcontent-%COMP%], .action-tag[_ngcontent-%COMP%]{color:gold}.value-tag[_ngcontent-%COMP%]{color:#7fff00}.number-tag[_ngcontent-%COMP%]{color:#0ff}.mail-options[_ngcontent-%COMP%]{color:#fd9d0d}.email-style[_ngcontent-%COMP%]{color:#22aee3;font-style:italic}.alert-md[_ngcontent-%COMP%]   .alert-checkbox-label[_ngcontent-%COMP%], [aria-checked=true].sc-ion-alert-md[_ngcontent-%COMP%]   .alert-radio-inner.sc-ion-alert-md[_ngcontent-%COMP%], [aria-checked=true].sc-ion-alert-ios[_ngcontent-%COMP%]   .alert-radio-inner.sc-ion-alert-ios[_ngcontent-%COMP%]{color:#fff!important}.item[_ngcontent-%COMP%]{padding-left:0;padding-right:0;position:relative;font-size:1.6rem;font-weight:400;text-transform:none;color:#fff;background-color:#fff;box-shadow:none;transition:background-color .3s cubic-bezier(.4,0,.2,1)}.item.activated[_ngcontent-%COMP%]{background-color:#f1f1f1}.item[no-lines][_ngcontent-%COMP%]{border-width:0}.item[_ngcontent-%COMP%]   h1[_ngcontent-%COMP%]{margin:0 0 2px;font-size:2.4rem;font-weight:400}.item[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{margin:2px 0;font-size:1.6rem;font-weight:400}.item[_ngcontent-%COMP%]   h3[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   h4[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   h5[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   h6[_ngcontent-%COMP%]{margin:2px 0;font-size:1.4rem;font-weight:400;line-height:normal}.item[_ngcontent-%COMP%]   p[_ngcontent-%COMP%]{margin:0 0 2px;overflow:inherit;font-size:1.4rem;line-height:normal;text-overflow:inherit;color:#666}.item.item-block[_ngcontent-%COMP%]   .item-inner[_ngcontent-%COMP%]{padding-right:8px;border-bottom:1px solid #dedede}.item[_ngcontent-%COMP%]   [item-end][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   [item-left][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   [item-right][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   [item-start][_ngcontent-%COMP%]{margin:9px 8px 9px 0}.item[_ngcontent-%COMP%]   ion-icon[item-end][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-icon[item-left][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-icon[item-right][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-icon[item-start][_ngcontent-%COMP%]{margin-left:0;margin-top:11px;margin-bottom:10px}.item[_ngcontent-%COMP%]   .item-button[_ngcontent-%COMP%]{padding:0 .6em;height:25px;font-size:1.2rem}.item[_ngcontent-%COMP%]   .item-button[icon-only][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   .item-button[icon-only][_ngcontent-%COMP%]   ion-icon[_ngcontent-%COMP%]{padding:0 1px}.item[_ngcontent-%COMP%]   ion-icon[item-left][_ngcontent-%COMP%] + .item-inner[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-icon[item-left][_ngcontent-%COMP%] + .item-input[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-icon[item-start][_ngcontent-%COMP%] + .item-inner[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-icon[item-start][_ngcontent-%COMP%] + .item-input[_ngcontent-%COMP%]{margin-left:24px}.item[_ngcontent-%COMP%]   ion-avatar[item-left][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-avatar[item-start][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-thumbnail[item-left][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-thumbnail[item-start][_ngcontent-%COMP%]{margin:8px 16px 8px 0}.item[_ngcontent-%COMP%]   ion-avatar[item-end][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-avatar[item-right][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-thumbnail[item-end][_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-thumbnail[item-right][_ngcontent-%COMP%]{margin:8px}.item[_ngcontent-%COMP%]   ion-avatar[_ngcontent-%COMP%]{min-width:40px;min-height:40px}.item[_ngcontent-%COMP%]   ion-avatar[_ngcontent-%COMP%]   img[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-avatar[_ngcontent-%COMP%]   ion-img[_ngcontent-%COMP%]{border-radius:50%;overflow:hidden;width:40px;height:40px}.item[_ngcontent-%COMP%]   ion-thumbnail[_ngcontent-%COMP%]{min-width:80px;min-height:80px}.item[_ngcontent-%COMP%]   ion-thumbnail[_ngcontent-%COMP%]   img[_ngcontent-%COMP%], .item[_ngcontent-%COMP%]   ion-thumbnail[_ngcontent-%COMP%]   ion-img[_ngcontent-%COMP%]{width:80px;height:80px}ion-list[_ngcontent-%COMP%]{--ion-safe-area-left: 0px;--ion-safe-area-right: 0px}[_nghost-%COMP%]{--inner-padding-end: 0px}ion-item[_ngcontent-%COMP%]{--inner-padding-end: 0px}ion-searchbar[_ngcontent-%COMP%]{font-size:1.6rem}ion-item-option[_ngcontent-%COMP%]{font-size:1.6rem;background-color:#5353534d;box-shadow:1px 1px 3px #333;border-radius:3px}.dark-control[_ngcontent-%COMP%]{min-height:40px;border:1px solid gray;width:98%;display:block;flex:1;line-height:1.5;padding:6px;margin:5px;border-radius:5px;background:linear-gradient(to bottom,rgba(0,0,0,.1) 0,rgba(0,0,0,.3) 100%)}ion-select[_ngcontent-%COMP%]   .dark-control[_ngcontent-%COMP%], .datetime-text[_ngcontent-%COMP%], .select-md[_ngcontent-%COMP%], ion-datetime[_ngcontent-%COMP%]{min-height:40px;border:1px solid gray;width:98%;display:block;flex:1;line-height:1.5;padding:6px;margin:5px;border-radius:5px;background:linear-gradient(to bottom,rgba(0,0,0,.1) 0,rgba(0,0,0,.3) 100%)}ion-alert[_ngcontent-%COMP%]   .alert-radio-label[_ngcontent-%COMP%]{overflow:hidden;flex:1;text-overflow:ellipsis;white-space:nowrap;color:initial;padding:13px 26px}ion-alert[_ngcontent-%COMP%]   .alert-radio-icon[_ngcontent-%COMP%]{left:13px;top:0;border-radius:50%;position:relative;display:block;width:16px;height:16px;border-width:2px;border-style:solid;border-color:#787878}.sc-ion-alert-md[_ngcontent-%COMP%], .alert-ios[_ngcontent-%COMP%]   .alert-radio-label[_ngcontent-%COMP%], select-alert[_ngcontent-%COMP%]   .alert-radio-label[_ngcontent-%COMP%]{color:#fff}.sc-ion-alert-md[_ngcontent-%COMP%]   [aria-checked=true][_ngcontent-%COMP%]   .alert-radio-label[_ngcontent-%COMP%]{color:#008aff}.sc-ion-alert-md[aria-checked=true][_ngcontent-%COMP%]   .alert-radio-icon[_ngcontent-%COMP%]{border-color:#008aff}.sc-ion-alert-md[_ngcontent-%COMP%]   [aria-checked=true][_ngcontent-%COMP%]   .alert-radio-inner[_ngcontent-%COMP%]{transform:scaleZ(1)}[aria-checked=true].sc-ion-alert-md[_ngcontent-%COMP%]   .alert-radio-inner.sc-ion-alert-md[_ngcontent-%COMP%], [aria-checked=true].sc-ion-alert-ios[_ngcontent-%COMP%]   .alert-radio-inner.sc-ion-alert-ios[_ngcontent-%COMP%]{transform:scaleZ(1);background-color:#008aff}.network-alert-auto[_ngcontent-%COMP%]   .alert-button[_ngcontent-%COMP%], .single-select-alert[_ngcontent-%COMP%]   .alert-button[_ngcontent-%COMP%]{min-width:10px;width:auto;margin:2px;height:auto;background:#192f48}ion-row[_ngcontent-%COMP%]{display:flex;flex-wrap:nowrap;justify-content:space-between}ion-checkbox[_ngcontent-%COMP%]{--size: 30px;--checkbox-background: var(--ion-color-light);--checkbox-background-checked: var(--ion-dark-theme-color);--checkmark-color: var(--ion-color-light);--border-style: 1px solid gray;position:static;display:block;margin:9px 36px 9px 4px}.item[_ngcontent-%COMP%]{background-color:#5353534d;box-shadow:1px 1px 3px #333;border-radius:3px}ion-button.device-btn.button[_ngcontent-%COMP%]{font-size:1.4rem;font-weight:500;text-transform:uppercase;padding-top:0;padding-bottom:0;--background: rgba(10,10,10,0);--padding-top: 0px;--padding-bottom: 0px;--padding-start: 0px;--padding-end: 0px}.full-primary-button[_ngcontent-%COMP%]{display:block;margin:10px auto;width:-webkit-fill-available}ion-textarea[_ngcontent-%COMP%]{--background: linear-gradient(to bottom, rgba(0, 0, 0, .1) 0%, rgba(0, 0, 0, .3) 100%);--border-style: 2px solid rgba(150, 150, 150, .3);--padding: 6px;--padding-top: 6px;--border-color:rgba(150, 150, 150, .3) }ion-textarea[_ngcontent-%COMP%], .sc-ion-textarea-md[_ngcontent-%COMP%], .sc-ion-textarea-ios[_ngcontent-%COMP%]{padding:6px;margin:5px;border-radius:5px;background:linear-gradient(to bottom,rgba(0,0,0,.1) 0%,rgba(0,0,0,.3) 100%);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#a6000000",endColorstr="#00000000",GradientType=0);border:2px solid rgba(150,150,150,.3);width:98%}.native-textarea.sc-ion-textarea-md[_ngcontent-%COMP%], .native-textarea.sc-ion-textarea-ios[_ngcontent-%COMP%]{padding:6px;margin:5px;border-radius:5px;background:linear-gradient(to bottom,rgba(0,0,0,.1) 0%,rgba(0,0,0,.3) 100%);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#a6000000",endColorstr="#00000000",GradientType=0);border:2px solid rgba(150,150,150,.3)}']}),p})()}];let D=(()=>{var a;class p{}return(a=p).\u0275fac=function(e){return new(e||a)},a.\u0275mod=t.oAB({type:a}),a.\u0275inj=t.cJS({imports:[P.Bz.forChild(k),P.Bz]}),p})();var w=c(23934),S=c(79773);let A=(()=>{var a;class p{}return(a=p).\u0275fac=function(e){return new(e||a)},a.\u0275mod=t.oAB({type:a}),a.\u0275inj=t.cJS({imports:[O.ez,u.u5,u.UX,l.Pc,D,_.aw.forChild(),w.o,S.D]}),p})()}}]);