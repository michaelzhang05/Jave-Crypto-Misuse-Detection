package com.inmobi.cmp.presentation.components;

import K7.f;
import K7.m;
import M7.g;
import O5.I;
import O5.t;
import S5.d;
import T7.c;
import a6.InterfaceC1668n;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import c.C1995c;
import c.C2001i;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.data.model.ChoiceColor;
import com.inmobi.cmp.data.model.ThemeMode;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import q.C3796f;
import y5.C4209b;

/* loaded from: classes4.dex */
public final class CmpActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18903b = 0;

    /* renamed from: a, reason: collision with root package name */
    public c f18904a;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18905a;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            iArr[ThemeMode.LIGHT.ordinal()] = 1;
            iArr[ThemeMode.DARK.ordinal()] = 2;
            f18905a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public int f18906a;

        public b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new b((d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            boolean z8;
            Object e8 = T5.b.e();
            int i8 = this.f18906a;
            c cVar = null;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar2 = CmpActivity.this.f18904a;
                if (cVar2 != null) {
                    this.f18906a = 1;
                    obj = AbstractC3360i.g(C3347b0.b(), new T7.b(cVar2, null), this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }
            R7.d dVar = R7.d.f9662a;
            R7.d.f9667f = (M7.c) obj;
            CmpActivity cmpActivity = CmpActivity.this;
            int i9 = CmpActivity.f18903b;
            Bundle extras = cmpActivity.getIntent().getExtras();
            if (extras == null) {
                string = null;
            } else {
                string = extras.getString("EXTRA_ACTION");
            }
            if (string != null) {
                int hashCode = string.hashCode();
                boolean z9 = false;
                if (hashCode != -2113348999) {
                    if (hashCode != -1969243076) {
                        if (hashCode != 1166950650) {
                            if (hashCode == 1517267649 && string.equals("ACTION_SHOW_CCPA_SCREEN")) {
                                if (!cmpActivity.isFinishing()) {
                                    FragmentManager supportFragmentManager = cmpActivity.getSupportFragmentManager();
                                    AbstractC3255y.h(supportFragmentManager, "supportFragmentManager");
                                    if (!supportFragmentManager.isDestroyed() && !supportFragmentManager.isStateSaved()) {
                                        if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                            m mVar = m.f5260a;
                                            mVar.e(f.CCPA, false);
                                            if (C2001i.f15552b) {
                                                mVar.e(f.USPWITHGBC, false);
                                            }
                                            supportFragmentManager.beginTransaction().add(new S7.d(), S7.d.f9944y).commit();
                                        } else {
                                            C4209b.b(C4209b.f41007a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                            cmpActivity.finish();
                                        }
                                    }
                                }
                            }
                        } else if (string.equals("ACTION_SHOW_CMP_DIALOG")) {
                            Bundle extras2 = cmpActivity.getIntent().getExtras();
                            if (extras2 != null) {
                                z9 = extras2.getBoolean("EXTRA_FORCE", false);
                            }
                            g c8 = dVar.p().c();
                            if (c8.f7321a.length() > 0 && c8.f7322b.length() > 0 && c8.f7323c.length() > 0 && c8.f7324d.length() > 0) {
                                m mVar2 = m.f5260a;
                                boolean z10 = !z9;
                                mVar2.e(f.GDPR, z10);
                                if (C2001i.f15552b) {
                                    mVar2.e(f.GDPRWITHGBC, z10);
                                }
                                G5.f fVar = new G5.f();
                                String simpleName = G5.f.class.getSimpleName();
                                AbstractC3255y.h(simpleName, "PrivacyBottomSheet::class.java.simpleName");
                                if (!cmpActivity.isFinishing()) {
                                    FragmentManager supportFragmentManager2 = cmpActivity.getSupportFragmentManager();
                                    AbstractC3255y.h(supportFragmentManager2, "supportFragmentManager");
                                    if (!supportFragmentManager2.isDestroyed() && !supportFragmentManager2.isStateSaved()) {
                                        fVar.show(supportFragmentManager2, simpleName);
                                    }
                                }
                                ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                                ChoiceCmpCallback callback = choiceCmp.getCallback();
                                if (callback != null) {
                                    callback.onCmpUIShown(choiceCmp.ping$app_release(true, CmpStatus.LOADED, DisplayStatus.VISIBLE));
                                }
                            } else {
                                C4209b.b(C4209b.f41007a, ChoiceError.MISSING_INIT_SCREEN_TEXTS, null, null, null, null, 30);
                                cmpActivity.finish();
                            }
                        }
                    } else if (string.equals("ACTION_SHOW_GBC_SCREEN")) {
                        if (!cmpActivity.isFinishing()) {
                            FragmentManager supportFragmentManager3 = cmpActivity.getSupportFragmentManager();
                            AbstractC3255y.h(supportFragmentManager3, "supportFragmentManager");
                            if (!supportFragmentManager3.isDestroyed() && !supportFragmentManager3.isStateSaved()) {
                                if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                    m.f5260a.e(f.GBC, false);
                                    supportFragmentManager3.beginTransaction().add(new C1995c(), C1995c.f15532r).commit();
                                } else {
                                    C4209b.b(C4209b.f41007a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                    cmpActivity.finish();
                                }
                            }
                        }
                    }
                } else if (string.equals("ACTION_SHOW_US_REGULATION_SCREEN")) {
                    Bundle extras3 = cmpActivity.getIntent().getExtras();
                    if (extras3 == null) {
                        z8 = false;
                    } else {
                        z8 = extras3.getBoolean("EXTRA_FORCE", false);
                    }
                    if (!cmpActivity.isFinishing()) {
                        FragmentManager supportFragmentManager4 = cmpActivity.getSupportFragmentManager();
                        AbstractC3255y.h(supportFragmentManager4, "supportFragmentManager");
                        if (!supportFragmentManager4.isDestroyed() && !supportFragmentManager4.isStateSaved()) {
                            if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                if (C2001i.f15552b) {
                                    m.f5260a.e(f.USPWITHGBC, false);
                                }
                                c cVar3 = cmpActivity.f18904a;
                                if (cVar3 != null) {
                                    cVar = cVar3;
                                } else {
                                    AbstractC3255y.y("viewModel");
                                }
                                if (cVar.f10185b.f3925b.f3876M) {
                                    String str = R7.d.f9675n;
                                    F6.g state = F6.g.CALIFORNIA;
                                    AbstractC3255y.i(state, "state");
                                    if (AbstractC3255y.d(str, DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                                        m.f5260a.e(f.CCPA, false);
                                        supportFragmentManager4.beginTransaction().add(new S7.d(), S7.d.f9944y).commit();
                                    }
                                }
                                m.f5260a.e(f.MSPA, !z8);
                                supportFragmentManager4.beginTransaction().add(new C3796f(), C3796f.f38011y).commit();
                            } else {
                                C4209b.b(C4209b.f41007a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                cmpActivity.finish();
                            }
                        }
                    }
                }
                return I.f8278a;
            }
            cmpActivity.finish();
            return I.f8278a;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i8;
        ChoiceColor darkModeColors;
        super.onCreate(bundle);
        R7.d dVar = R7.d.f9662a;
        ThemeMode themeMode = R7.d.f9665d.getThemeMode();
        if (themeMode == null) {
            i8 = -1;
        } else {
            i8 = a.f18905a[themeMode.ordinal()];
        }
        if (i8 != 1) {
            if (i8 == 2) {
                getDelegate().setLocalNightMode(2);
            }
        } else {
            getDelegate().setLocalNightMode(1);
        }
        AbstractC3255y.i(this, "context");
        AbstractC3255y.i(this, "context");
        if (R7.d.f9687z == null) {
            if (R7.d.f9665d.getThemeMode() == ThemeMode.LIGHT) {
                darkModeColors = R7.d.f9665d.getLightModeColors();
            } else if (R7.d.f9665d.getThemeMode() == ThemeMode.DARK) {
                darkModeColors = R7.d.f9665d.getDarkModeColors();
            } else if (R7.d.f9665d.getLightModeColors() != null && R7.d.f9665d.getDarkModeColors() != null) {
                int i9 = getResources().getConfiguration().uiMode & 48;
                if (i9 != 16) {
                    if (i9 == 32) {
                        darkModeColors = R7.d.f9665d.getDarkModeColors();
                    }
                    darkModeColors = R7.d.f9665d.getLightModeColors();
                } else {
                    darkModeColors = R7.d.f9665d.getLightModeColors();
                }
            } else {
                if (R7.d.f9665d.getLightModeColors() == null) {
                    darkModeColors = R7.d.f9665d.getDarkModeColors();
                }
                darkModeColors = R7.d.f9665d.getLightModeColors();
            }
            R7.d.f9687z = new O7.b(darkModeColors, new P7.a());
        }
        O7.a aVar = R7.d.f9687z;
        if (aVar == null) {
            AbstractC3255y.y("choiceStyleSheetRepository");
            aVar = null;
        }
        c cVar = new c(aVar, dVar.j());
        AbstractC3255y.i(cVar, "<set-?>");
        this.f18904a = cVar;
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }
}
