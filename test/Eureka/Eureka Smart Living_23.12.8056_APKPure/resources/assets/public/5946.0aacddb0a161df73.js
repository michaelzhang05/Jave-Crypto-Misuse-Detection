"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[5946],{69473:(v,c,s)=>{s.r(c),s.d(c,{FilterSelectorPageModule:()=>m});var i=s(96814),e=s(56223),n=s(73582),o=s(70160),t=s(26190),l=s(65879);const g=[{path:"",component:t.N}];let d=(()=>{var r;class a{}return(r=a).\u0275fac=function(h){return new(h||r)},r.\u0275mod=l.oAB({type:r}),r.\u0275inj=l.cJS({imports:[o.Bz.forChild(g),o.Bz]}),a})();var f=s(63999);let m=(()=>{var r;class a{}return(r=a).\u0275fac=function(h){return new(h||r)},r.\u0275mod=l.oAB({type:r}),r.\u0275inj=l.cJS({imports:[i.ez,e.u5,n.Pc,d,f.aw.forChild()]}),a})()},56450:(v,c,s)=>{s.d(c,{q:()=>n});class i{constructor(t,l,g,d){this.id=t,this.name=l,this.type=g,this.image_url=d}}var e=s(86845);class n extends i{constructor(t,l,g,d=!1,f="",m=[],r=[],a=!0,u=!1,h=!0,y=[e.t.Unknown],p=[]){super(t,l,g,f),this.category_and_type=!0,this.exclude=!1,this.visible=!0,this.eventFilterType=[e.t.Unknown],this.is_all=d,this.category=m,this.device_types=r,this.category_and_type=a,this.exclude=u,this.visible=h,this.eventFilterType=y,this.exclusionCategoryType=p}}},79616:(v,c,s)=>{s.d(c,{_:()=>f});var i=s(56450),e=s(77144),n=s(9952),o=s(19462),t=s(86845);class l{constructor(r,a){this.deviceCategory=r,this.deviceType=a}}var g=s(1901);class f{static getFilterByType(r){return this.list_of_filters.find(a=>a.type==r)}static getFilterByName(r){return this.list_of_filters.find(a=>a.name==r)}static getFilteredThings(r,a){let u=r;a.exclusionCategoryType&&a.exclusionCategoryType.length>0&&a.exclusionCategoryType.forEach(h=>{u=u.filter(y=>!(y.thingType==g.a.Device&&y.type==h.deviceType&&y.category==h.deviceCategory))})}}f.list_of_filters=[new i.q(-1,"all","all",!0,o.s.Images.all_device,void 0,void 0,void 0,void 0,void 0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(-3,"rooms","rooms",!1,o.s.Images.default_room_image,[],[],!1,!0,!0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(-2,"scenes","scene",!0,o.s.Images.scene,[],[],!1,!0,!0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(0,"lights","lights",!1,o.s.Images.light._90,[n.I.Lighting],[e.Y.RGB,e.Y.Dimmer,e.Y.Switch],void 0,void 0,void 0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(2,"climate","climate",!1,o.s.Images.climate,[n.I.HVAC,n.I.Fan,n.I.Other],[e.Y.Thermostat,e.Y.Generic],!0,void 0,void 0,[t.t.ThingPropertyChange,t.t.Action],[new l(n.I.Other,e.Y.Switch),new l(n.I.Other,e.Y.Dimmer),new l(n.I.Other,e.Y.Generic)]),new i.q(1,"curtains","curtains",!1,o.s.Images.shutter._50,[n.I.Curtains],[e.Y.Shutter],void 0,void 0,void 0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(3,"sensors","sensors",!1,o.s.Images.sensors,[n.I.Other,n.I.Gate],[e.Y.HumiditySensor,e.Y.TemperatureSensor,e.Y.MotionSensor,e.Y.OccupancySensor,e.Y.EnvironmentSensor,e.Y.DoorSensor,e.Y.GenericSensor,e.Y.FloodSensor,e.Y.SmokeSensor,e.Y.LightSensor],!0,void 0,void 0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(7,"doors","doors",!1,o.s.Images.doors,[n.I.Other,n.I.Gate,n.I.Lock],[e.Y.DoorSensor,e.Y.DoorBell,e.Y.Lock],!0,!1,!0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(5,"media","media",!1,o.s.Images.multi_media_devices,[n.I.Media],[e.Y.MultiMedia],!1,!1,!0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(4,"others","others",!1,o.s.Images.other_devices,[n.I.Siren,n.I.Appliances,n.I.Valve,n.I.Other],[e.Y.Switch,e.Y.Generic,e.Y.VirtualDevice,e.Y.RemoteControl],!0,!1,void 0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(6,"cameras","camera",!1,o.s.Images.camera_devices,[n.I.Other],[e.Y.Camera],!0,!1,!0,[t.t.ThingPropertyChange,t.t.Action]),new i.q(8,"meters","meters",!1,o.s.Images.generic_meter,[n.I.Other],[e.Y.AcMeter,e.Y.GenericMeter,e.Y.WaterMeter,e.Y.PowerMeter],!0,!1,!0,[t.t.ThingPropertyChange,t.t.Action])]},86845:(v,c,s)=>{s.d(c,{t:()=>i});var i=function(e){return e[e.Unknown=0]="Unknown",e[e.ThingPropertyChange=1]="ThingPropertyChange",e[e.GenericEvent=2]="GenericEvent",e[e.Notification=3]="Notification",e[e.Action=4]="Action",e}(i||{})}}]);