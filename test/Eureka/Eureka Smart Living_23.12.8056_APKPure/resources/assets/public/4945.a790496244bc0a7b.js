"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[4945],{51506:(O,S,f)=>{f.d(S,{ER:()=>v,EW:()=>T,G4:()=>c,Ms:()=>U,P5:()=>P,RA:()=>w,YY:()=>_,Yb:()=>h,Zq:()=>M,kb:()=>D,mw:()=>g,yh:()=>I});class c{constructor(){this.RoomId=void 0,this.ImageId=void 0,this.Type=0,this.SortOrder=0,this.Visible=1,this.Enabled=1,this.Silent=1,this.Capabilities=void 0,this.device_Capabilities=[0],this.Category=0,this.MeteringEnabled=0,this.MeteringProperties="",this.MeteringReferenceId="",this.MeteringExternalId="",this.MeteringAccountId="",this.MeteringRemarks="",this.AverageConsumptionRate=0,this.ConsumptionCostRate=0,this.PollingInterval=0,this.interfaceMapPropertyEntities=[],this.deviceUiEntity=null,this.deviceUiControlEntityDTOs=[],this.deviceActionEntities=[],this.devicePropertyEntities=[],this.voiceCommandThingEntities=[],this.thingVoiceAssistantNameEntity=null,this.thresholds=[]}set VisibleUI(p){this.Visible=p?1:0}get VisibleUI(){return 1==this.Visible}set EnabledUI(p){this.Enabled=p?1:0}get EnabledUI(){return 1==this.Enabled}}class h{constructor(){this.InterfaceId=-1,this.ThingType=0,this.ThingId=0}}class D{constructor(){this.InterfaceMapId=0,this.Name="",this.Value="",this.Description="",this.PossibleValues=[]}}class v{constructor(){this.Name="",this.Description=""}}class g{constructor(){this.DeviceId=0,this.Rows=0,this.HasDetailedUI=0,this.HasDefaultAction=0,this.StateProperty=""}DeviceUiEntity(p){this.DeviceId=p,this.Rows=0,this.HasDetailedUI=0,this.HasDefaultAction=0,this.StateProperty=""}}class _{constructor(){this.DeviceId=0,this.IsMain=0,this.Name="",this.Type="",this.DefaultValue=""}}class M{constructor(){this.DeviceId=0,this.Name=""}}class T{constructor(){this.ThingType=0,this.ThingId=0,this.LanguageId=0,this.Priority=0,this.Command=""}}class I{constructor(){this.ThingType=0,this.ThingId=0,this.Enabled=0,this.Name=""}}class U{constructor(){this.DeviceId=0,this.DeviceType=0,this.Property="",this.Low3="",this.Low2="",this.Low1="",this.High1="",this.High2="",this.High3=""}}class w{constructor(){this.Id=0,this.DeviceUiId=0,this.Type=0,this.Name="",this.Command="",this.Text="",this.ImageId=0,this.Row=0,this.RowOrder=0,this.Width=0,this.Offset=0,this.Enabled=0,this.Visible=0,this.VisibleOnCard=0,this.IsMain=0}}class P{}},44945:(O,S,f)=>{f.d(S,{V:()=>y});var c=f(15861),h=f(79805),D=f(15788),v=f(88118),g=f(8873),_=f(1901),M=f(83088),T=f(51506),I=f(78677),U=f(50515),w=f(32206),P=f(16568),o=f(19462),p=f(52110);class y{ParseRequestTypeEntity(e){return(0,c.Z)(function*(){console.warn("Parsing requestType entity");let n=new M.xd;if(e&&(e.requestTypeEntity&&(n.id=e.requestTypeEntity.id,n.name=e.requestTypeEntity.name,n.description=e.requestTypeEntity.description,n.action=e.requestTypeEntity.action,n.email=e.requestTypeEntity.email,n.imageId=e.requestTypeEntity.imageId),e.requestStepEntities)){let r=[];for(let l=0;l<e.requestStepEntities.length;l++){let i=e.requestStepEntities[l],a=new M.CI;if(a.id=i.id,a.name=i.name,a.description=i.description,a.type=i.type,i.imageId>-1){a.imageId=i.imageId;let t=g.a.DefaultController.images.find(s=>s.id==i.imageId);a.image=t,console.log(t)}a.selectOptions=i.selectOptions,r.push(a)}n.steps=r}return n})()}ParseDeviceEntity(e){return(0,c.Z)(function*(){console.warn("Parsing dashboard entity");let n=new T.G4;if(e){if(e.deviceEntity){if(n.Id=e.deviceEntity.id,n.Name=e.deviceEntity.name,n.Capabilities=e.deviceEntity.capabilities,(n.Capabilities&w.q.BatteryPowered)==w.q.BatteryPowered&&n.device_Capabilities.push(w.q.BatteryPowered),(n.Capabilities&w.q.PowerMetering)==w.q.PowerMetering&&n.device_Capabilities.push(w.q.PowerMetering),n.device_Capabilities.length>1){let i=n.device_Capabilities.findIndex(function(a){return 0==a});0==n.device_Capabilities[i]&&n.device_Capabilities.splice(i,1)}n.Category=e.deviceEntity.category,n.AverageConsumptionRate=e.deviceEntity.consumptionRate,n.ConsumptionCostRate=e.deviceEntity.costRate,n.Enabled=e.deviceEntity.enabled,n.ImageId=e.deviceEntity.imageId,n.MeteringEnabled=e.deviceEntity.meteringEnabled,n.MeteringAccountId=e.deviceEntity.meteringAccountId,n.MeteringExternalId=e.deviceEntity.meteringExternalId,n.MeteringProperties=e.deviceEntity.meteringProperties,n.MeteringReferenceId=e.deviceEntity.meteringReferenceId,n.MeteringRemarks=e.deviceEntity.meteringRemarks,n.PollingInterval=e.deviceEntity.pollingInterval,n.RoomId=e.deviceEntity.roomId,n.Silent=e.deviceEntity.silent,n.SortOrder=e.deviceEntity.sortOrder,n.Type=e.deviceEntity.type,n.Visible=e.deviceEntity.visible}if(e.interfaceMapEntity&&(n.interfaceMapEntity=new T.Yb,n.interfaceMapEntity.Id=e.interfaceMapEntity.id,n.interfaceMapEntity.InterfaceId=e.interfaceMapEntity.interfaceId,n.interfaceMapEntity.ThingId=e.interfaceMapEntity.thingId,n.interfaceMapEntity.ThingType=e.interfaceMapEntity.thingType),e.deviceActionEntities){let i=[];for(let a=0;a<e.deviceActionEntities.length;a++){let t=e.deviceActionEntities[a],s=new T.Zq;s.Id=t.id,s.Name=t.name,s.DeviceId=t.deviceId,i.push(s)}n.deviceActionEntities=i}if(e.devicePropertyEntities){let i=[];for(let a=0;a<e.devicePropertyEntities.length;a++){let t=e.devicePropertyEntities[a],s=new T.YY;s.Id=t.id,s.Name=t.name,s.Type=t.type,s.IsMain=t.isMain,s.DeviceId=t.deviceId,s.DefaultValue=t.defaultValue,i.push(s)}n.devicePropertyEntities=i}if(e.deviceUiControlEntityDTOs){let i;for(let a=0;a<e.deviceUiControlEntityDTOs.length;a++){let t=new T.P5,s=e.deviceUiControlEntityDTOs[a];if(s.deviceUiControl){let d=new T.RA;d.Id=s.deviceUiControl.id,d.Name=s.deviceUiControl.name,d.ImageId=s.deviceUiControl.imageId,d.Command=s.deviceUiControl.command,d.DeviceUiId=s.deviceUiControl.deviceUiId,d.Enabled=s.deviceUiControl.enabled,d.IsMain=s.deviceUiControl.isMain,d.Offset=s.deviceUiControl.offset,d.Row=s.deviceUiControl.row,d.RowOrder=s.deviceUiControl.rowOrder,d.Text=s.deviceUiControl.text,d.Type=s.deviceUiControl.type,d.Visible=s.deviceUiControl.visible,d.VisibleOnCard=s.deviceUiControl.visibleOnCard,d.Width=s.deviceUiControl.width,t.DeviceUiControl=d}let u=[];if(s.voiceCommandThingUiControl&&s.voiceCommandThingUiControl.length>0){for(let d=0;d<s.voiceCommandThingUiControl.length;d++){let E=s.voiceCommandThingUiControl[d],b=new I.U;b.id=E.id,b.language_id=E.language_id,b.control_id=E.control_id,b.command=E.command,b.priority=E.priority,u.push(b)}t.VoiceCommandThingUiControl=u}let C=[];if(s.uiDataTranslationEntity&&s.uiDataTranslationEntity.length>0){for(let d=0;d<s.uiDataTranslationEntity.length;d++){let E=s.uiDataTranslationEntity[d],b=new U.r;b.FieldName=E.fieldName,b.TableName=E.tableName,b.Translation=E.translation,b.UiLanguageId=E.uiLanguageId,C.push(b)}t.uiDataTranslationEntity=C}i.push(t)}n.deviceUiControlEntityDTOs=i}if(e.deviceUiEntity&&(n.deviceUiEntity=new T.mw,n.deviceUiEntity.Id=e.deviceUiEntity.id,n.deviceUiEntity.DeviceId=e.deviceUiEntity.deviceId,n.deviceUiEntity.Rows=e.deviceUiEntity.rows,n.deviceUiEntity.StateProperty=e.deviceUiEntity.stateProperty,n.deviceUiEntity.HasDefaultAction=e.deviceUiEntity.hasDefaultAction,n.deviceUiEntity.HasDetailedUI=e.deviceUiEntity.hasDetailedUI),e.interfaceMapPropertyEntities){let i=[];i=yield g.a.DefaultController.GetInterfaceDeviceMappingProperties(n.interfaceMapEntity.InterfaceId,n.Type,n.device_Capabilities[0]).then(t=>t),i&&i.length>0&&i.sort((t,s)=>t.Name.localeCompare(s.Name)),e.interfaceMapPropertyEntities&&e.interfaceMapPropertyEntities.length>0&&e.interfaceMapPropertyEntities.sort((t,s)=>t.name.localeCompare(s.name));let a=[];if(e.interfaceMapPropertyEntities&&e.interfaceMapPropertyEntities.length>0)for(let t=0;t<e.interfaceMapPropertyEntities.length;t++){let s=e.interfaceMapPropertyEntities[t],u=new T.kb;u.Id=s.id,u.InterfaceMapId=s.interfaceMapId,u.Name=s.name,i&&i.length>0?i[t]&&i[t].Name==s.name&&(console.log(i[t].Description,"DESCRITPTION From IF"),u.Description=i[t].Description,u.PossibleValues=i[t].PossibleValues?i[t].PossibleValues:[]):u.PossibleValues=[],u.Value=s.value,a.push(u)}n.interfaceMapPropertyEntities=a}if(e.thingVoiceAssistantNameEntity&&(n.thingVoiceAssistantNameEntity=new T.yh,n.thingVoiceAssistantNameEntity.Id=e.thingVoiceAssistantNameEntity.id,n.thingVoiceAssistantNameEntity.Name=e.thingVoiceAssistantNameEntity.name,n.thingVoiceAssistantNameEntity.ThingId=e.thingVoiceAssistantNameEntity.thingId,n.thingVoiceAssistantNameEntity.ThingType=e.thingVoiceAssistantNameEntity.thingType,n.thingVoiceAssistantNameEntity.Enabled=e.thingVoiceAssistantNameEntity.enabled),e.thresholdEntities&&e.thresholdEntities.length>0)for(let i=0;i<e.thresholdEntities.length;i++){let a=e.thresholdEntities[i],t=new T.Ms;t.Id=a.id,t.DeviceId=a.deviceId,t.DeviceType=e.deviceEntity.type,t.Property=a.property,t.Low1=a.low1,t.Low2=a.low2,t.Low3=a.low3,t.High1=a.high1,t.High2=a.high2,t.High3=a.high3,n.thresholds.push(t)}let r=[];if(e.voiceCommandThingEntities&&e.voiceCommandThingEntities.length>0){for(let i=0;i<e.voiceCommandThingEntities.length;i++){let a=e.voiceCommandThingEntities[i],t=new T.EW;t.Id=a.id,t.LanguageId=a.languageId,t.ThingId=a.thingId,t.ThingType=a.thingType,t.Command=a.command,t.Priority=a.priority,r.push(t)}n.voiceCommandThingEntities=r}let l=[];if(e.uiDataTranslationEntities&&e.uiDataTranslationEntities.length>0){for(let i=0;i<e.uiDataTranslationEntities.length;i++){let a=e.uiDataTranslationEntities[i];console.log(a,"UDTE_item");let t=new U.r;t.FieldName=a.fieldName,t.TableName=a.tableName,t.Translation=a.translation,t.UiLanguageId=a.uiLanguageId,l.push(t)}n.uiDataTranslationEntities=l}}return n})()}ParseInterfaceEntity(e){console.warn("Parsing Interface entity",e);let n=new p.u;if(e&&(e.interfaceEntity&&(n.id=e.interfaceEntity.id,n.name=e.interfaceEntity.name,n.type=e.interfaceEntity.type),e.interfacePropertyEntities)){let r=[];for(let l=0;l<e.interfacePropertyEntities.length;l++){let i=e.interfacePropertyEntities[l],a=new p.c;a.id=i.id,a.name=i.name,a.value=i.value,a.interfaceId=i.interfaceId,console.log(a,"interfaceProperty"),r.push(a)}n.interfacePropertyEntities=r}return n}ParseSmartSpaceEntity(e){console.warn("Parsing Smart Space entity");let n=new P.kg;if(e){if(e.smartSpaceEntity){n.Id=e.smartSpaceEntity.id,n.Name=e.smartSpaceEntity.name,n.Description=e.smartSpaceEntity.description,n.Type=e.smartSpaceEntity.type,n.ThumbnailFile=e.smartSpaceEntity.thumbnailFile,n.DataFile=e.smartSpaceEntity.dataFile;let i=JSON.parse(e.smartSpaceEntity.items);if(i&&i.length)for(var r=0;r<i.length;r++){let t=i[r];t.Type==P.AE.Dashboard?(g.a.DefaultController.GetDashboard(t.ThingId).then(s=>{t.Item=this.ParseDashboard(s.body.result)}),t.Image=o.s.Images.dashboard):t.ThingType==_.a.Device?(t.Item=g.a.DefaultController.devices.find(s=>s.id==t.ThingId),t.Image=t.Item._image_id.main_url):(t.Item=g.a.DefaultController.scenes.find(s=>s.id==t.ThingId),t.Image=o.s.Images.scene),n.Items.push(t)}let a=JSON.parse(e.smartSpaceEntity.areas);if(a&&a.length)for(var l=0;l<a.length;l++)n.Areas.push(a[l])}if(console.log(n.Items),e.smartSpaceModels&&e.smartSpaceModels.length>0){let i=[];for(let a=0;a<e.smartSpaceModels.length;a++){let t=e.smartSpaceModels[a].smartSpaceModelEntity,s=new P.kB;s.Id=t.id,s.Name=t.name,s.Type=t.type,s.File=t.file,i.push(s)}n.Models=i}}return n}ParseDashboardEntity(e){console.warn("Parsing dashboard entity");let n=new h.A;if(e){if(e.dashboardEntity){if(n.Id=e.dashboardEntity.id,n.Name=e.dashboardEntity.name,n.Columns=e.dashboardEntity.columns,n.Rows=e.dashboardEntity.rows,n.HeaderType=e.dashboardEntity.headerType,n.Orientation=e.dashboardEntity.orientation,n.SubDashboards=e.dashboardEntity.subDashboards,n.AutoHideHeader=e.dashboardEntity.autoHideHeader,n.CloseButtonHeader=e.dashboardEntity.closeButtonHeader,n.ImageId=e.dashboardEntity.imageId,g.a.DefaultController&&g.a.DefaultController.images){let r=g.a.DefaultController.images.find(l=>l.id==n.ImageId);r&&(n.Image=r.main_url,n.ImageItem=r)}n.Style=new v.y,n.Style.InitializeFromStyleText(e.dashboardEntity.style),n.ItemStyle=new v.y,n.ItemStyle.InitializeFromStyleText(e.dashboardEntity.itemStyle)}if(e.dashboardItemEntityDTOs&&e.dashboardItemEntityDTOs.length>0){let r=[];for(let l=0;l<e.dashboardItemEntityDTOs.length;l++){let i=e.dashboardItemEntityDTOs[l].dashboardItemEntity,a=e.dashboardItemEntityDTOs[l].dashboardItemSettingEntities,t=new h.GZ;if(t.Id=i.id,t.ZIndex=i.zIndex,t.Style=new v.y,t.Style.InitializeFromStyleText(i.style),t.Name=i.title,t.Type=i.type,t.Left=i.left,t.Top=i.top,t.ImageId=i.imageId,g.a.DefaultController&&g.a.DefaultController.images){let s=g.a.DefaultController.images.find(u=>u.id==t.ImageId);s&&(t.Image=s.main_url,t.ImageItem=s)}if(t.RowSpan=i.rowSpan,t.ColSpan=i.columnSpan,t.Type==h.RV.Thing?(t.ThingId=i.thingId,t.ThingType=i.thingType,1==t.ThingType?t.Item=g.a.DefaultController.devices.find(s=>s.id==t.ThingId):2==t.ThingType?t.Item=g.a.DefaultController.scenes.find(s=>s.id==t.ThingId):3==t.ThingType&&(t.Item=g.a.DefaultController.rooms.find(s=>s.id==t.ThingId),t.CommandType=i.commandType,t.CommandParameters=i.commandParameters,t.ThingId=i.thingId,t.ThingType=i.thingType)):t.Type==h.RV.Content?t.Content=i.content:t.Type==h.RV.Video||t.Type==h.RV.ImageSlides||t.Type==h.RV.Image?(t.Link=i.url,t.UseServerMediaPath=!D.b.isPathAbsolute(i.url)):t.Type==h.RV.Command?(t.CommandType=i.commandType,t.CommandParameters=i.commandParameters,t.ThingId=i.thingId,t.ThingType=i.thingType):t.Content=i.content,a&&a.length>0){let s={};for(let u=0;u<a.length;u++){let C=a[u],d=new h.oV;d.Id=C.id,d.Value=C.value,d.Name=C.name;let E=new h.ix;switch(d.Name){case E.DateFormat:d.ControlType=h.RW.DateFormat;break;case E.TimeFormat:d.ControlType=h.RW.TimeFormat;break;case E.CommandDisplay:d.ControlType=h.RW.CommandsType;break;case E.Dashboard:d.ControlType=h.RW.ListOfDashboards;break;case E.AutoPlay:d.ControlType=h.RW.Checkbox;break;case E.Duration:d.ControlType=h.RW.Number;break;case E.Icon:d.ControlType=h.RW.Icon;break;default:d.ControlType=h.RW.Checkbox}s[C.name]="True"==C.value||"true"==C.value||"false"!=C.value&&"False"!=C.value&&C.value}t.Settings=s}r.push(t)}n.Items=r}}return n}ParseDashboard(e){let n=new h.A;if(e){if(n.Id=e.Id,n.Name=e.Name,n.Columns=e.Columns,n.Style=new v.y,n.Style.InitializeFromStyleText(e.Style),n.ItemStyle=new v.y,n.ItemStyle.InitializeFromStyleText(e.ItemStyle),n.Rows=e.Rows,n.HeaderType=e.HeaderType,n.Orientation=e.Orientation,n.SubDashboards=e.SubDashboards,n.AutoHideHeader=e.AutoHideHeader,n.CloseButtonHeader=e.CloseButtonHeader,n.ImageId=e.ImageId,g.a.DefaultController&&g.a.DefaultController.images){let r=g.a.DefaultController.images.find(l=>l.id==n.ImageId);r&&(n.Image=r.main_url,n.ImageItem=r)}if(e.Items&&e.Items.length>0){let r=[];for(let l=0;l<e.Items.length;l++)try{let i=e.Items[l],a=e.Items[l].Settings,t=new h.GZ;if(t.Name=i.Title,t.Id=i.Id,t.ZIndex=i.ZIndex,t.Style=new v.y,t.Style.InitializeFromStyleText(i.Style),t.RowSpan=i.RowSpan,t.ColSpan=i.ColumnSpan,t.Left=i.Left,t.Top=i.Top,t.Type=i.Type,t.ImageId=i.ImageId,g.a.DefaultController&&g.a.DefaultController.images){let s=g.a.DefaultController.images.find(u=>u.id==t.ImageId);s&&(t.ImageItem=s,t.Image=s.main_url)}if(t.Type==h.RV.Thing?(t.ThingId=i.ThingId,t.ThingType=i.ThingType,g.a.DefaultController&&g.a.DefaultController.devices&&(1==t.ThingType?t.Item=g.a.DefaultController.devices.find(s=>s.id==t.ThingId):2==t.ThingType?t.Item=g.a.DefaultController.scenes.find(s=>s.id==t.ThingId):3==t.ThingType&&(t.Item=g.a.DefaultController.rooms.find(s=>s.id==t.ThingId),t.CommandType=i.CommandType,t.CommandParameters=i.CommandParameters,t.ThingType=i.ThingType))):t.Type==h.RV.Content?(t.Content=i.Content,t.Unfocusable=!!i.Focusable&&i.Unfocusable):t.Type==h.RV.Video||t.Type==h.RV.ImageSlides||t.Type==h.RV.Image?(t.Link=i.Url,t.UseServerMediaPath=!D.b.isPathAbsolute(i.Url)):t.Type==h.RV.Command?(t.CommandType=i.CommandType,t.CommandParameters=i.CommandParameters,t.ThingType=i.ThingType,t.ThingId=i.ThingId):t.Content=i.Content,a){let s=[];for(let u in a)a.hasOwnProperty(u)&&(s[u]="false"!=a[u]&&"False"!=a[u]&&("true"==a[u]||"True"==a[u]||a[u]));t.Settings=s}r.push(t)}catch(i){console.error("dashboard item parsing error",i)}n.Items=r}}return n}interfaceToCreateOrUpdateEntity(e,n=!0){let r={};r.interfaceEntity={name:e.name,type:e.type},n||(r.interfaceEntity.id=e.id),r.interfacePropertyEntities=[];for(let l=0;l<e.interfacePropertyEntities.length;l++){let i=e.interfacePropertyEntities[l];console.log(i,"Property item"),r.interfacePropertyEntities.push({Name:i.name,Value:i.value,InterfaceId:0})}return r}smartSpaceToCreateOrUpdateEntity(e,n=!0){let r={},l=[],i=[];if(e.Items.length>0)for(var a=0;a<e.Items.length;a++)console.log(e.Items[a]),l.push({Id:e.Items[a].Id,Name:e.Items[a].Name,ThingId:e.Items[a].ThingId,Type:e.Items[a].Type,ThingType:e.Items[a].ThingType,LabelId:e.Items[a].LabelId,MarkerId:e.Items[a].MarkerId,Settings:e.Items[a].Settings,Eye:e.Items[a].Eye,Look:e.Items[a].Look,Up:e.Items[a].Up,WorldPos:e.Items[a].WorldPos,EntityId:e.Items[a].EntityId,ShowAnnotationLabel:!1});if(e.Areas.length>0)for(var t=0;t<e.Areas.length;t++)i.push({Id:e.Areas[t].Id,Name:e.Areas[t].Name,Eye:e.Areas[t].Eye,Look:e.Areas[t].Look,Up:e.Areas[t].Up,IsDefault:e.Areas[t].IsDefault});r.SmartSpaceEntity={name:e.Name,description:e.Description,type:e.Type,thumbnailFile:e.ThumbnailFile,dataFile:e.DataFile,items:JSON.stringify(l),areas:JSON.stringify(i)},n||(r.SmartSpaceEntity.id=e.Id),r.SmartSpaceModels=[];for(let s=0;s<e.Models.length;s++){let u=e.Models[s];r.SmartSpaceModels.push({SmartSpaceModelEntity:{name:u.Name,type:u.Type,file:u.File}})}return r}dashboardToCreateOrUpdateEntity(e,n=!0){let r={};r.dashboardEntity={name:e.Name,columns:e.Columns,rows:e.Rows,headerType:e.HeaderType,orientation:e.Orientation,style:e.Style.GetStyleText(),itemStyle:e.ItemStyle.GetStyleText(),subDashboards:e.SubDashboards,imageId:e.ImageId,autoHideHeader:Number(e.AutoHideHeader),closeButtonHeader:Number(e.CloseButtonHeader)},n||(r.dashboardEntity.id=e.Id),r.dashboardItemEntityDTOs=[];for(let l=0;l<e.Items.length;l++){let i=e.Items[l],a={columnSpan:i.ColSpan,rowSpan:i.RowSpan,top:i.Top,left:i.Left,zIndex:i.ZIndex,type:i.Type,style:i.Style.GetStyleText(),imageId:i.ImageId,title:i.Name};i.Type==h.RV.Thing?(a.ThingType=i.ThingType,a.ThingId=i.ThingId,i.ThingType==_.a.Room&&(a.commandType=i.CommandType,a.commandParameters=i.CommandParameters)):i.Type==h.RV.Command?(a.commandType=i.CommandType,a.commandParameters=i.CommandParameters,a.thingId=i.ThingId,a.thingType=i.ThingType):i.Type==h.RV.Video||i.Type==h.RV.ImageSlides||i.Type==h.RV.Image?a.url=i.Link:i.Type==h.RV.Content&&(a.content=i.Content,a.unfocusable=i.Unfocusable);let t=[];for(let s in i.Settings)if(i.Settings.hasOwnProperty(s)){let u={};u.Name=s,u.Value=null!=i.Settings[s]&&"false"!=i.Settings[s]&&"False"!=i.Settings[s]&&i.Settings[s],t.push(u)}r.dashboardItemEntityDTOs.push({dashboardItemEntity:a,dashboardItemSettingEntities:t})}return r}requestToCreateEntity(e){let n={};n.requestEntity={requestTypeID:e.requestType.id,status:e.status,date:e.date,user:e.user},n.requestEntity.id=0,n.requestItemEntityDTOs=[];for(let r=0;r<e.items.length;r++){let l=e.items[r];n.requestItemEntityDTOs.push({requestItemEntity:{requestStepID:l.requestStep.id,requestID:0,type:l.type,data:l.data,index:l.index}})}return n}}},52110:(O,S,f)=>{f.d(S,{c:()=>h,u:()=>c});class c{constructor(){this.type=-1,this.interfacePropertyEntities=[]}}class h{constructor(){this.interfaceId=-1,this.possibleValues=[]}}},16568:(O,S,f)=>{f.d(S,{AE:()=>w,PE:()=>I,W7:()=>T,eu:()=>P,hO:()=>M,kB:()=>_,kg:()=>g});var c=f(77144),h=f(1901),D=function(o){return o[o.BIM=0]="BIM",o}(D||{}),v=function(o){return o[o._3ds=0]="_3ds",o[o.json=1]="json",o[o.glb=2]="glb",o[o.gltf=3]="gltf",o[o.ifc=4]="ifc",o[o.laz=5]="laz",o[o.stl=6]="stl",o[o.xkt=7]="xkt",o[o.xml3d=8]="xml3d",o[o.obj=9]="obj",o}(v||{});class g{constructor(){this.Type=D.BIM,this._Models=[],this.Items=[],this.Areas=[]}get Models(){return this._Models}set Models(p){this._Models=p}}class _{constructor(){this.Type=v._3ds}}class M{constructor(){this.Type=w.Thing,this.ThingType=h.a.Device,this.Selectable=!1,this._item_guid="",this.Visable=!1,this.Eye=[],this.Look=[],this.Up=[],this.WorldPos=[],this.EntityId="",this.ShowAnnotationLabel=!1}get Description(){return this.Type==w.Thing?"Thing-"+(this._Item&&this._Item.isScene?"(SCENE)":"")+this.Name:this.Name}get ImageStateUrl(){return this.ImageItem.getStateImage(this.Item.value)}get Item(){return this._Item}set Item(p){this._Item=p}onValueChangeListener(p,y,m){y.ImageItem&&(y.Image=y.ImageItem.getStateImage(m))}}class T{constructor(){this.Eye=[],this.Look=[],this.Up=[],this.IsDefault=!1}}var I=function(o){return o[o.Checkbox=0]="Checkbox",o[o.DateFormat=1]="DateFormat",o[o.TimeFormat=2]="TimeFormat",o[o.Number=3]="Number",o[o.CommandsType=4]="CommandsType",o[o.Icon=5]="Icon",o[o.String=6]="String",o[o.ListOfCamerasViews=7]="ListOfCamerasViews",o[o.ListOfGaugeTypes=8]="ListOfGaugeTypes",o[o.ListOfWidths=9]="ListOfWidths",o[o.ListOfHeights=10]="ListOfHeights",o}(I||{}),w=function(o){return o[o.Undefined=0]="Undefined",o[o.Thing=1]="Thing",o[o.Command=2]="Command",o[o.Image=3]="Image",o[o.ImageSlides=4]="ImageSlides",o[o.Video=5]="Video",o[o.Content=6]="Content",o[o.DateTime=7]="DateTime",o[o.Calendar=8]="Calendar",o[o.Weather=9]="Weather",o[o.GlobalVariable=10]="GlobalVariable",o[o.Dashboard=11]="Dashboard",o}(w||{});class P{get ShowApps(){return"ShowApps"}get AllowDetailAccess(){return"AllowDetailAccess"}get ShowArrowKeys(){return"ShowArrowKeys"}get ShowChannelControl(){return"ShowChannelControl"}get ShowChannelStatus(){return"ShowChannelStatus"}get ShowSources(){return"ShowSources"}get ShowExtraKeys(){return"ShowExtraKeys"}get ShowFunctionKeys(){return"ShowFunctionKeys"}get ShowMediaControl(){return"ShowMediaControl"}get ShowMediaControlStatus(){return"ShowMediaControlStatus"}get ShowNumberPadControl(){return"ShowNumberPadControl"}get ShowPowerCommand(){return"ShowPowerCommand"}get ShowPowerStatus(){return"ShowPowerStatus"}get ShowSourceStatus(){return"ShowSourceStatus"}get ShowVolumeControl(){return"ShowVolumeControl"}get ShowVolumeMute(){return"ShowVolumeMute"}get ShowVolumeStatus(){return"ShowVolumeStatus"}get ShowLastChanged(){return"ShowLastChanged"}get ShowIcon(){return"ShowIcon"}get ShowText(){return"ShowText"}get ShowButton(){return"ShowButton"}get ShowMainReading(){return"ShowMainReading"}get ShowDetailedReading(){return"ShowDetailedReading"}get ShowPowerGauge(){return"ShowPowerGauge"}get ShowVoltGauge(){return"ShowVoltGauge"}get ShowCurrentGauge(){return"ShowCurrentGauge"}get ShowFlowGauge(){return"ShowFlowGauge"}get ShowTitle(){return"ShowTitle"}get ShowLabel(){return"ShowLabel"}get Label(){return"Label"}get ShowDate(){return"ShowDate"}get ShowTime(){return"ShowTime"}get ShowCity(){return"ShowCity"}get ShowTemperature(){return"ShowTemperature"}get ShowLocation(){return"ShowLatLon"}get ShowWind(){return"ShowWind"}get ShowHumidity(){return"ShowHumidity"}get TemperatureScale(){return"TemperatureScale"}get ShowSourceCommand(){return"ShowSourceCommand"}get ShowControls(){return"ShowControls"}get Camera(){return"Camera"}get GlobalVariable(){return"GlobalVariable"}get CameraViews(){return"CameraViews"}get GaugeTypes(){return"GaugeTypes"}get ShowCameraPreview(){return"ShowCameraPreview"}get ShowInformation(){return"ShowInformation"}get ShowInformationOnOverlay(){return"ShowInformationOnOverlay"}get ShowDeviceTypesButtons(){return"ShowDeviceTypesButtons"}get OverlayInfoMinimumFontSize(){return"OverlayInfoMinimumFontSize"}get OverlayBackground(){return"OverlayBackground"}get PreferLiveView(){return"PreferLiveView"}get ShowBrightness(){return"ShowBrightness"}get ShowColorSwatches(){return"ShowColorSwatches"}get ShowWhite(){return"ShowWhite"}get ShowAnimation(){return"ShowAnimation"}get ShowHue(){return"ShowHue"}get ShowWeather(){return"ShowWeather"}get ShowLastValueTime(){return"ShowLastValueTime"}get ShowValue(){return"ShowValue"}get ShowSetTemperature(){return"ShowSetTemperature"}get ShowModes(){return"ShowModes"}get ShowDetails(){return"ShowDetails"}get ShowSlider(){return"ShowSlider"}get ShowButtonsAsValue(){return"ShowButtonsAsValue"}get ShowButtonsValueLabels(){return"ShowButtonsValueLabels"}get ShowMultiMedia(){return"ShowMultiMedia"}get ShowButtons(){return"ShowButtons"}get Loop(){return"Loop"}get AutoPlay(){return"AutoPlay"}get Duration(){return"Duration"}get Dashboard(){return"Dashboard"}get Icon(){return"Icon"}get VideoStreaming(){return"VideoStreaming"}get ImageSequence(){return"ImageSequence"}get Live(){return"Live"}get ShowBackground(){return"ShowBackground"}get EnableFloat(){return"EnableFloat"}get CommandDisplay(){return"CommandDisplay"}get AnnotaionDialogWidth(){return"AnnotaionDialogWidth"}get AnnotaionDialogHeight(){return"AnnotaionDialogHeight"}get DateFormat(){return"DateFormat"}get Unfocusable(){return"Unfocusable"}get TimeFormat(){return"TimeFormat"}getOptionNamesByItemType(p,y){let m=[];if(m.push(this.ShowTitle),m.push(this.ShowIcon),m.push(this.ShowBackground),p==w.Thing&&y)switch(m.push(this.ShowControls),y){case c.Y.Switch:break;case c.Y.Dimmer:m.push(this.ShowSlider);break;case c.Y.RGB:m.push(this.ShowHue),m.push(this.ShowBrightness);break;case c.Y.Shutter:m.push(this.ShowSlider);break;case c.Y.VirtualDevice:m.push(this.ShowText),m.push(this.ShowButton),m.push(this.ShowSlider);break;case c.Y.Thermostat:m.push(this.ShowSetTemperature),m.push(this.ShowModes),m.push(this.ShowDetails),m.push(this.ShowWeather);break;case c.Y.PowerMeter:m.push(this.ShowMainReading),m.push(this.ShowDetailedReading),m.push(this.ShowPowerGauge),m.push(this.ShowVoltGauge),m.push(this.ShowCurrentGauge);break;case c.Y.WaterMeter:case c.Y.AcMeter:m.push(this.ShowMainReading),m.push(this.ShowDetailedReading);break;case c.Y.GenericMeter:m.push(this.ShowMainReading)}}getControlTypeByName(p){switch(p){case this.DateFormat:return I.DateFormat;case this.AnnotaionDialogHeight:return I.ListOfHeights;case this.AnnotaionDialogWidth:return I.ListOfWidths;case this.TimeFormat:return I.TimeFormat;case this.CommandDisplay:return I.CommandsType;case this.AutoPlay:return I.Checkbox;case this.Duration:return I.Number;case this.Label:return I.String;case this.Icon:return I.Icon;case this.CameraViews:return I.ListOfCamerasViews;case this.GaugeTypes:return I.ListOfGaugeTypes;case this.OverlayInfoMinimumFontSize:return I.Number;default:return I.Checkbox}}}}}]);