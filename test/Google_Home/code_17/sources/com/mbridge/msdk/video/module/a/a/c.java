package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: k, reason: collision with root package name */
    private IJSFactory f23587k;

    public c(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i8, z8);
        this.f23587k = iJSFactory;
        if (iJSFactory == null) {
            this.f23596a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i8, Object obj) {
        if (this.f23596a) {
            if (i8 != 8) {
                if (i8 != 105) {
                    if (i8 != 107) {
                        if (i8 != 112) {
                            if (i8 == 115) {
                                com.mbridge.msdk.video.signal.j jSVideoModule = this.f23587k.getJSVideoModule();
                                this.f23587k.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                            }
                        } else {
                            this.f23587k.getJSVideoModule().setCover(true);
                            this.f23587k.getJSVideoModule().setMiniEndCardState(true);
                            this.f23587k.getJSVideoModule().videoOperate(2);
                        }
                    } else {
                        this.f23587k.getJSContainerModule().showVideoClickView(-1);
                        this.f23587k.getJSVideoModule().setCover(false);
                        this.f23587k.getJSVideoModule().setMiniEndCardState(false);
                        this.f23587k.getJSVideoModule().videoOperate(1);
                    }
                } else {
                    this.f23587k.getJSNotifyProxy().a(3, obj.toString());
                    i8 = -1;
                }
            } else if (!this.f23587k.getJSContainerModule().showAlertWebView()) {
                this.f23587k.getJSVideoModule().showAlertView();
            } else {
                this.f23587k.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.a(i8, obj);
    }
}
