package com.mbridge.msdk.video.module.a.a;

import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public final class m extends o {

    /* renamed from: l, reason: collision with root package name */
    private MBridgeVideoView f22558l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeContainerView f22559m;

    /* renamed from: n, reason: collision with root package name */
    private int f22560n;

    /* renamed from: o, reason: collision with root package name */
    private Timer f22561o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f22562p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22563q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22564r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22565s;

    /* renamed from: t, reason: collision with root package name */
    private int f22566t;

    /* renamed from: u, reason: collision with root package name */
    private int f22567u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.a f22568v;

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i8, int i9, com.mbridge.msdk.video.module.a.a aVar2, int i10, boolean z8, int i11) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i10, z8);
        boolean z9;
        this.f22562p = new Handler();
        this.f22563q = false;
        this.f22564r = false;
        this.f22565s = false;
        this.f22558l = mBridgeVideoView;
        this.f22559m = mBridgeContainerView;
        this.f22567u = i8;
        this.f22560n = i9;
        this.f22566t = i11;
        if (mBridgeVideoView != null) {
            if (mBridgeVideoView.getVideoSkipTime() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f22563q = z9;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f22541a = false;
        }
    }

    private void i() {
        try {
            Timer timer = this.f22561o;
            if (timer != null) {
                timer.cancel();
                this.f22561o = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.f22542b
            if (r0 == 0) goto L70
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r0 = r4.f22558l
            if (r0 == 0) goto L5c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r0.mCampOrderViewData
            if (r0 == 0) goto L5c
            r0 = 0
            r1 = 0
        L15:
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f22558l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            int r2 = r2.size()
            if (r1 >= r2) goto L45
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f22558l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L42
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f22558l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            java.lang.String r2 = r2.getId()
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r4.f22542b
            java.lang.String r3 = r3.getId()
            if (r2 != r3) goto L42
            int r0 = r1 + (-1)
            goto L45
        L42:
            int r1 = r1 + 1
            goto L15
        L45:
            if (r0 < 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f22558l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f22558l
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r0 = r1.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f22558l
            if (r1 == 0) goto L66
            r1.setCampaign(r0)
        L66:
            com.mbridge.msdk.video.module.MBridgeContainerView r1 = r4.f22559m
            if (r1 == 0) goto L6d
            r1.setCampaign(r0)
        L6d:
            r4.a(r0)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.a.a.m.j():void");
    }

    @Override // com.mbridge.msdk.video.module.a.a.o, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i8, Object obj) {
        Integer num;
        int i9;
        CampaignEx campaignEx;
        if (this.f22541a) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 5) {
                        if (i8 != 6) {
                            if (i8 == 8) {
                                MBridgeContainerView mBridgeContainerView = this.f22559m;
                                if (mBridgeContainerView != null) {
                                    if (!mBridgeContainerView.showAlertWebView()) {
                                        MBridgeVideoView mBridgeVideoView = this.f22558l;
                                        if (mBridgeVideoView != null) {
                                            mBridgeVideoView.showAlertView();
                                        }
                                    } else {
                                        MBridgeVideoView mBridgeVideoView2 = this.f22558l;
                                        if (mBridgeVideoView2 != null) {
                                            mBridgeVideoView2.alertWebViewShowed();
                                        }
                                    }
                                } else {
                                    MBridgeVideoView mBridgeVideoView3 = this.f22558l;
                                    if (mBridgeVideoView3 != null) {
                                        mBridgeVideoView3.showAlertView();
                                    }
                                }
                            } else if (i8 == 20) {
                                if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                                    this.f22568v = (MBridgeVideoView.a) obj;
                                }
                            } else {
                                switch (i8) {
                                    case 10:
                                        this.f22564r = true;
                                        this.f22558l.soundOperate(0, 2);
                                        this.f22558l.progressOperate(0, 2);
                                        break;
                                    case 11:
                                        this.f22558l.videoOperate(3);
                                        this.f22558l.dismissAllAlert();
                                        CampaignEx campaignEx2 = this.f22542b;
                                        if (campaignEx2 != null && campaignEx2.getVideo_end_type() != 3 && this.f22542b.getRewardTemplateMode() != null && this.f22542b.getRewardTemplateMode().f() != 5002010) {
                                            if (this.f22542b.getAdSpaceT() != 2) {
                                                this.f22558l.setVisibility(8);
                                            }
                                        } else {
                                            this.f22558l.setVisibility(0);
                                        }
                                        CampaignEx campaignEx3 = this.f22542b;
                                        if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5) {
                                            MBridgeVideoView mBridgeVideoView4 = this.f22558l;
                                            if (mBridgeVideoView4.mCurrPlayNum == mBridgeVideoView4.mCampaignSize) {
                                                MBridgeContainerView mBridgeContainerView2 = this.f22559m;
                                                if (mBridgeContainerView2 != null) {
                                                    mBridgeContainerView2.setRewardStatus(true);
                                                    this.f22559m.showOrderCampView();
                                                    break;
                                                }
                                            }
                                        }
                                        CampaignEx campaignEx4 = this.f22542b;
                                        if (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null || this.f22542b.getRewardTemplateMode().f() != 5002010) {
                                            if (this.f22542b.getAdSpaceT() == 2) {
                                                this.f22559m.showVideoEndCover();
                                                break;
                                            } else {
                                                this.f22559m.showEndcard(this.f22542b.getVideo_end_type());
                                                break;
                                            }
                                        }
                                        break;
                                    case 12:
                                        h();
                                        this.f22558l.videoOperate(3);
                                        this.f22558l.dismissAllAlert();
                                        if (this.f22542b.getVideo_end_type() != 3) {
                                            this.f22558l.setVisibility(8);
                                        } else {
                                            this.f22558l.setVisibility(0);
                                        }
                                        if (this.f22564r || this.f22566t != 0) {
                                            if (this.f22542b.isDynamicView() && this.f22542b.getDynamicTempCode() == 5 && TextUtils.isEmpty(this.f22542b.getendcard_url())) {
                                                j();
                                                this.f22566t = 0;
                                            }
                                            if (!this.f22564r && this.f22566t == 1) {
                                                g();
                                                f();
                                                e();
                                                if (af.a().a("i_l_s_t_r_i", false) && !this.f22565s) {
                                                    this.f22565s = true;
                                                    MBridgeVideoView.a aVar = this.f22568v;
                                                    if (aVar != null) {
                                                        aVar.a();
                                                    }
                                                }
                                            }
                                            if (this.f22542b.getAdSpaceT() != 2) {
                                                this.f22559m.showEndcard(this.f22542b.getVideo_end_type());
                                                break;
                                            } else {
                                                this.f22559m.showVideoEndCover();
                                                break;
                                            }
                                        }
                                        break;
                                    case 13:
                                        this.f22558l.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.f22563q) {
                                            this.f22558l.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                            MBridgeVideoView.b bVar = (MBridgeVideoView.b) obj;
                                            int videoInteractiveType = this.f22559m.getVideoInteractiveType();
                                            if (this.f22542b.getAdSpaceT() == 2) {
                                                this.f22559m.showVideoClickView(1);
                                            } else if (videoInteractiveType >= 0 && bVar.f22509a >= videoInteractiveType) {
                                                this.f22559m.showVideoClickView(1);
                                                this.f22558l.soundOperate(0, 1);
                                            }
                                            this.f22563q = bVar.f22511c;
                                            if (this.f22542b.getDynamicTempCode() == 5) {
                                                int i10 = bVar.f22509a;
                                                int i11 = bVar.f22510b;
                                                if (!this.f22563q && this.f22558l != null && (campaignEx = this.f22542b) != null) {
                                                    int i12 = this.f22560n;
                                                    int i13 = (i12 < 0 || i10 < i12) ? 1 : 2;
                                                    if (i13 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i10 > this.f22542b.getVideoCompleteTime() : this.f22558l.mCurrPlayNum > 1)) {
                                                        i13 = 2;
                                                    }
                                                    if (i13 != 2 && this.f22558l.mCurrPlayNum > 1 && i10 == i11) {
                                                        i13 = 2;
                                                    }
                                                    if (i13 == 2) {
                                                        this.f22558l.closeVideoOperate(0, i13);
                                                        this.f22563q = true;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i14 = this.f22560n;
                                                if (((i14 >= 0 && ((i9 = bVar.f22509a) >= i14 || i9 == bVar.f22510b)) || (this.f22542b.getVideoCompleteTime() > 0 && (bVar.f22509a > this.f22542b.getVideoCompleteTime() || bVar.f22509a == bVar.f22510b))) && !this.f22563q) {
                                                    this.f22558l.closeVideoOperate(0, 2);
                                                    this.f22563q = true;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f22558l.soundOperate(num.intValue(), -1);
                    }
                }
                this.f22558l.dismissAllAlert();
                this.f22558l.videoOperate(3);
                CampaignEx campaignEx5 = this.f22542b;
                if (campaignEx5 != null && campaignEx5.isDynamicView() && this.f22542b.getDynamicTempCode() == 5) {
                    if (this.f22559m != null) {
                        MBridgeVideoView mBridgeVideoView5 = this.f22558l;
                        if (mBridgeVideoView5.mCurrPlayNum == mBridgeVideoView5.mCampaignSize) {
                            if (this.f22542b.getAdSpaceT() != 2) {
                                this.f22559m.setRewardStatus(true);
                                this.f22559m.showOrderCampView();
                            }
                            i8 = 16;
                        }
                    }
                    com.mbridge.msdk.video.bt.module.b.f.a(this.f22542b, this.f22547g, this.f22558l.mCurrentPlayProgressTime);
                }
                if (this.f22567u == 2 && !this.f22559m.endCardShowing() && this.f22542b.getAdSpaceT() != 2) {
                    this.f22559m.showEndcard(this.f22542b.getVideo_end_type());
                }
                i8 = 16;
            } else if (!this.f22559m.endCardShowing()) {
                int videoInteractiveType2 = this.f22559m.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f22559m.isLast()) {
                            this.f22559m.showVideoClickView(1);
                            this.f22558l.soundOperate(0, 1);
                            try {
                                i();
                                this.f22561o = new Timer();
                                this.f22561o.schedule(new TimerTask() { // from class: com.mbridge.msdk.video.module.a.a.m.1
                                    @Override // java.util.TimerTask, java.lang.Runnable
                                    public final void run() {
                                        try {
                                            m.this.f22562p.post(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.m.1.1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    m.this.f22559m.showVideoClickView(-1);
                                                    m.this.f22558l.soundOperate(0, 2);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            if (MBridgeConstans.DEBUG) {
                                                th.printStackTrace();
                                            }
                                        }
                                    }
                                }, 3000L);
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        } else {
                            this.f22559m.showVideoClickView(-1);
                            this.f22558l.soundOperate(0, 2);
                            i();
                        }
                    }
                } else if (this.f22559m.miniCardLoaded()) {
                    this.f22559m.showVideoClickView(2);
                }
            }
        }
        super.a(i8, obj);
    }
}
