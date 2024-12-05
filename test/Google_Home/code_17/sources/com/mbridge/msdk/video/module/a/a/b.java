package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: k, reason: collision with root package name */
    private MBridgeVideoView f23585k;

    /* renamed from: l, reason: collision with root package name */
    private MBridgeContainerView f23586l;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i8, z8);
        this.f23585k = mBridgeVideoView;
        this.f23586l = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f23596a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i8, Object obj) {
        if (this.f23596a) {
            if (i8 != 8) {
                if (i8 != 107) {
                    if (i8 != 112) {
                        if (i8 == 115) {
                            this.f23586l.resizeMiniCard(this.f23585k.getBorderViewWidth(), this.f23585k.getBorderViewHeight(), this.f23585k.getBorderViewRadius());
                        }
                    } else {
                        this.f23585k.setCover(true);
                        this.f23585k.setMiniEndCardState(true);
                        this.f23585k.videoOperate(2);
                    }
                } else {
                    this.f23586l.showVideoClickView(-1);
                    this.f23585k.setCover(false);
                    this.f23585k.setMiniEndCardState(false);
                    this.f23585k.videoOperate(1);
                }
            } else {
                MBridgeContainerView mBridgeContainerView = this.f23586l;
                if (mBridgeContainerView != null) {
                    if (!mBridgeContainerView.showAlertWebView()) {
                        MBridgeVideoView mBridgeVideoView = this.f23585k;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.showAlertView();
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView2 = this.f23585k;
                        if (mBridgeVideoView2 != null) {
                            mBridgeVideoView2.alertWebViewShowed();
                        }
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f23585k;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            }
        }
        super.a(i8, obj);
    }
}
