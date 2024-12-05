package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* loaded from: classes4.dex */
public final class n extends o {

    /* renamed from: l, reason: collision with root package name */
    private IJSFactory f22571l;

    /* renamed from: m, reason: collision with root package name */
    private int f22572m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22573n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22574o;

    /* renamed from: p, reason: collision with root package name */
    private int f22575p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22576q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeVideoView.a f22577r;

    public n(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i8, int i9, com.mbridge.msdk.video.module.a.a aVar2, int i10, boolean z8, int i11) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i10, z8);
        boolean z9;
        this.f22573n = false;
        this.f22574o = false;
        this.f22576q = false;
        this.f22571l = iJSFactory;
        this.f22572m = i8;
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f22573n = z9;
        this.f22575p = i11;
        if (iJSFactory == null) {
            this.f22541a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.o, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i8, Object obj) {
        Integer num;
        int i9;
        int i10 = i8;
        if (this.f22541a) {
            String str = "";
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 5) {
                        int i11 = 6;
                        if (i10 != 6) {
                            if (i10 != 8) {
                                if (i10 != 20) {
                                    if (i10 != 114) {
                                        if (i10 != 116) {
                                            switch (i10) {
                                                case 10:
                                                    this.f22576q = true;
                                                    this.f22571l.getJSNotifyProxy().a(0);
                                                    break;
                                                case 11:
                                                case 12:
                                                    this.f22571l.getJSVideoModule().videoOperate(3);
                                                    if (this.f22542b.getVideo_end_type() != 3) {
                                                        if (this.f22542b.getAdSpaceT() != 2) {
                                                            this.f22571l.getJSVideoModule().setVisible(8);
                                                        }
                                                    } else {
                                                        this.f22571l.getJSVideoModule().setVisible(0);
                                                    }
                                                    if (i10 == 12) {
                                                        h();
                                                        i9 = 2;
                                                    } else {
                                                        i9 = 1;
                                                    }
                                                    this.f22571l.getJSNotifyProxy().a(i9);
                                                    if (this.f22571l.getJSCommon().g() == 2) {
                                                        this.f22571l.getJSVideoModule().setVisible(0);
                                                        com.mbridge.msdk.video.signal.j jSVideoModule = this.f22571l.getJSVideoModule();
                                                        this.f22571l.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                    } else if (i10 == 12) {
                                                        if (this.f22575p == 1) {
                                                            if (this.f22542b.getAdSpaceT() != 2) {
                                                                this.f22571l.getJSContainerModule().showEndcard(this.f22542b.getVideo_end_type());
                                                            } else {
                                                                this.f22571l.getJSContainerModule().showVideoEndCover();
                                                            }
                                                        }
                                                    } else if (this.f22542b.getAdSpaceT() != 2) {
                                                        this.f22571l.getJSContainerModule().showEndcard(this.f22542b.getVideo_end_type());
                                                    } else {
                                                        this.f22571l.getJSContainerModule().showVideoEndCover();
                                                    }
                                                    this.f22571l.getJSVideoModule().dismissAllAlert();
                                                    if (i10 == 12 && !this.f22576q && this.f22575p == 1) {
                                                        h();
                                                        g();
                                                        f();
                                                        e();
                                                        if (af.a().a("i_l_s_t_r_i", false) && !this.f22574o) {
                                                            this.f22574o = true;
                                                            MBridgeVideoView.a aVar = this.f22577r;
                                                            if (aVar != null) {
                                                                aVar.a();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 13:
                                                    if (!this.f22571l.getJSVideoModule().isH5Canvas()) {
                                                        this.f22571l.getJSVideoModule().closeVideoOperate(0, 2);
                                                    }
                                                    this.f22571l.getJSNotifyProxy().a(-1);
                                                    break;
                                                case 14:
                                                    if (!this.f22573n) {
                                                        this.f22571l.getJSVideoModule().closeVideoOperate(0, 1);
                                                        break;
                                                    }
                                                    break;
                                                case 15:
                                                    if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                                        this.f22573n = true;
                                                        this.f22571l.getJSNotifyProxy().a((MBridgeVideoView.b) obj);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 123:
                                                        case 124:
                                                            com.mbridge.msdk.video.signal.g jSNotifyProxy = this.f22571l.getJSNotifyProxy();
                                                            if (i10 == 123) {
                                                                i11 = 7;
                                                            }
                                                            jSNotifyProxy.a(i11, "");
                                                            break;
                                                        case 125:
                                                            this.f22571l.getJSContainerModule().hideAlertWebview();
                                                            break;
                                                    }
                                            }
                                        } else {
                                            com.mbridge.msdk.video.signal.j jSVideoModule2 = this.f22571l.getJSVideoModule();
                                            this.f22571l.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                        }
                                    } else if (this.f22571l.getJSCommon().g() == 2) {
                                        com.mbridge.msdk.video.signal.j jSVideoModule3 = this.f22571l.getJSVideoModule();
                                        this.f22571l.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                    }
                                } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                                    this.f22577r = (MBridgeVideoView.a) obj;
                                }
                            } else if (!this.f22571l.getJSContainerModule().showAlertWebView()) {
                                this.f22571l.getJSVideoModule().showAlertView();
                            } else {
                                this.f22571l.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f22571l.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.f22571l.getJSNotifyProxy().a(5, num + "");
                    }
                }
                this.f22571l.getJSVideoModule().dismissAllAlert();
                if (i10 == 2) {
                    this.f22571l.getJSNotifyProxy().a(2, "");
                }
                this.f22571l.getJSVideoModule().videoOperate(3);
                int i12 = 16;
                if (this.f22571l.getJSCommon().g() != 2) {
                    if (this.f22542b.getVideo_end_type() != 3) {
                        this.f22571l.getJSVideoModule().setVisible(8);
                    } else {
                        this.f22571l.getJSVideoModule().setVisible(0);
                    }
                    if (this.f22572m == 2 && !this.f22571l.getJSContainerModule().endCardShowing() && this.f22542b.getAdSpaceT() != 2) {
                        this.f22571l.getJSContainerModule().showEndcard(this.f22542b.getVideo_end_type());
                        i12 = i10;
                    }
                }
                this.f22571l.getJSNotifyProxy().a(1);
                i10 = i12;
            } else if (!this.f22571l.getJSContainerModule().endCardShowing()) {
                com.mbridge.msdk.video.signal.g jSNotifyProxy2 = this.f22571l.getJSNotifyProxy();
                if (obj != null) {
                    str = obj.toString();
                }
                jSNotifyProxy2.a(1, str);
            }
        }
        super.a(i10, obj);
    }
}
