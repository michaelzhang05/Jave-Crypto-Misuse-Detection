package com.inmobi.cmp;

import L5.I;
import L5.t;
import L7.m;
import L7.o;
import L7.p;
import L7.q;
import L7.r;
import L7.u;
import L7.w;
import X5.n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import b.C1841l;
import c.C1895i;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import com.inmobi.cmp.presentation.components.CmpActivity;
import com.mbridge.msdk.MBridgeConstans;
import i6.AbstractC2829k;
import i6.J;
import i6.M;
import i6.N;
import i6.U0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import v5.C3832b;
import v5.EnumC3833c;
import y5.C3998e;
import y5.s;

/* loaded from: classes.dex */
public final class ChoiceCmp {

    /* renamed from: a */
    public static ChoiceCmpCallback f17809a = null;

    /* renamed from: b */
    public static String f17810b = "";

    /* renamed from: c */
    public static String f17811c = "";

    /* renamed from: d */
    public static C1841l f17812d;

    /* renamed from: e */
    public static M f17813e;
    public static final ChoiceCmp INSTANCE = new ChoiceCmp();

    /* renamed from: f */
    public static final J f17814f = new i(J.f31714m0);

    /* renamed from: g */
    public static final Pattern f17815g = Pattern.compile("^(p-)?([a-zA-Z0-9_-]{13})$");

    /* loaded from: classes.dex */
    public static final class a extends l implements n {
        public a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new a((P5.d) obj2).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            t.b(obj);
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            ChoiceCmpCallback callback = choiceCmp.getCallback();
            if (callback != null) {
                callback.onCmpLoaded(choiceCmp.ping$app_release(true, CmpStatus.LOADED, DisplayStatus.HIDDEN));
            }
            O7.d dVar = O7.d.f7806a;
            if (O7.d.f7807b != null) {
                ChoiceCmp.access$showCmpDialog(choiceCmp, dVar.b());
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f17816a;

        /* renamed from: c */
        public int f17818c;

        public b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17816a = obj;
            this.f17818c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.b(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f17819a;

        /* renamed from: c */
        public int f17821c;

        public c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17819a = obj;
            this.f17821c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.c(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f17822a;

        /* renamed from: c */
        public int f17824c;

        public d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17822a = obj;
            this.f17824c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.d(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f17825a;

        /* renamed from: c */
        public int f17827c;

        public e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17825a = obj;
            this.f17827c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.e(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f17828a;

        /* renamed from: c */
        public int f17830c;

        public f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17828a = obj;
            this.f17830c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.f(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f17831a;

        /* renamed from: c */
        public int f17833c;

        public g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17831a = obj;
            this.f17833c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.g(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f17834a;

        /* renamed from: c */
        public int f17836c;

        public h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17834a = obj;
            this.f17836c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.h(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements O7.a {
        @Override // O7.a
        public void a() {
            C1841l c1841l = ChoiceCmp.f17812d;
            if (c1841l == null) {
                AbstractC3159y.y("viewModel");
                c1841l = null;
            }
            if (!c1841l.f14233l) {
                ChoiceCmp.INSTANCE.a();
            }
        }

        @Override // O7.a
        public void b() {
            M m8 = ChoiceCmp.f17813e;
            if (m8 != null) {
                N.d(m8, null, 1, null);
            }
            ChoiceCmp.f17813e = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends l implements n {

        /* renamed from: a */
        public int f17837a;

        public k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new k((P5.d) obj2).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f17837a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                this.f17837a = 1;
                if (ChoiceCmp.access$loadCmpInfo(choiceCmp, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$loadCmpInfo(com.inmobi.cmp.ChoiceCmp r6, P5.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof b.C1830a
            if (r0 == 0) goto L16
            r0 = r7
            b.a r0 = (b.C1830a) r0
            int r1 = r0.f14204c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f14204c = r1
            goto L1b
        L16:
            b.a r0 = new b.a
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r6 = r0.f14202a
            java.lang.Object r7 = Q5.b.e()
            int r1 = r0.f14204c
            java.lang.String r2 = "viewModel"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            L5.t.b(r6)
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            L5.t.b(r6)
            goto L5e
        L3e:
            L5.t.b(r6)
            b.l r6 = com.inmobi.cmp.ChoiceCmp.f17812d
            if (r6 != 0) goto L49
            kotlin.jvm.internal.AbstractC3159y.y(r2)
            r6 = r5
        L49:
            r0.f14204c = r4
            r6.getClass()
            i6.I r1 = i6.C2812b0.b()
            b.d r4 = new b.d
            r4.<init>(r6, r5)
            java.lang.Object r6 = i6.AbstractC2825i.g(r1, r4, r0)
            if (r6 != r7) goto L5e
            goto L80
        L5e:
            y5.g r6 = (y5.g) r6
            b.l r1 = com.inmobi.cmp.ChoiceCmp.f17812d
            if (r1 != 0) goto L68
            kotlin.jvm.internal.AbstractC3159y.y(r2)
            goto L69
        L68:
            r5 = r1
        L69:
            r5.getClass()
            java.lang.String r1 = "cmpIab"
            kotlin.jvm.internal.AbstractC3159y.i(r6, r1)
            r5.f14237p = r6
            com.inmobi.cmp.ChoiceCmp r6 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f14204c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r7) goto L7e
            goto L80
        L7e:
            L5.I r7 = L5.I.f6487a
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$loadCmpInfo(com.inmobi.cmp.ChoiceCmp, P5.d):java.lang.Object");
    }

    public static final void access$showCmpDialog(ChoiceCmp choiceCmp, Context context) {
        choiceCmp.getClass();
        C1841l c1841l = f17812d;
        C1841l c1841l2 = null;
        if (c1841l == null) {
            AbstractC3159y.y("viewModel");
            c1841l = null;
        }
        if (c1841l.l()) {
            if (choiceCmp.isViewModelAvailable$app_release()) {
                C1841l c1841l3 = f17812d;
                if (c1841l3 == null) {
                    AbstractC3159y.y("viewModel");
                    c1841l3 = null;
                }
                if (c1841l3.o()) {
                    C1841l c1841l4 = f17812d;
                    if (c1841l4 == null) {
                        AbstractC3159y.y("viewModel");
                        c1841l4 = null;
                    }
                    E6.a coreConfig = c1841l4.f14224c.f2375b;
                    AbstractC3159y.i(coreConfig, "coreConfig");
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) coreConfig.f2323J);
                    sb.append(coreConfig.f2327N);
                    sb.append(coreConfig.f2328O);
                    String b8 = I7.b.b(sb.toString());
                    SharedStorage sharedStorage = c1841l4.f14222a;
                    N7.a aVar = N7.a.MSPA_PURPOSE_HASH;
                    if (!AbstractC3159y.d(b8, sharedStorage.j(aVar)) || c1841l4.j()) {
                        if (c1841l4.m()) {
                            c1841l4.f14222a.e(N7.a.GBC_PURPOSE_HASH, c1841l4.e());
                        }
                        SharedStorage sharedStorage2 = c1841l4.f14222a;
                        E6.a coreConfig2 = c1841l4.f14224c.f2375b;
                        AbstractC3159y.i(coreConfig2, "coreConfig");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) coreConfig2.f2323J);
                        sb2.append(coreConfig2.f2327N);
                        sb2.append(coreConfig2.f2328O);
                        sharedStorage2.e(aVar, I7.b.b(sb2.toString()));
                        c1841l4.f14222a.b(N7.a.MSPA_PURPOSE_CONSENT);
                        c1841l4.f14222a.b(N7.a.MSPA_SENSITIVE_PURPOSE_CONSENT);
                        C1841l c1841l5 = f17812d;
                        if (c1841l5 == null) {
                            AbstractC3159y.y("viewModel");
                            c1841l5 = null;
                        }
                        if (!c1841l5.k()) {
                            C6.i.f1350a.b(O7.d.f7806a.h());
                        }
                        C1841l c1841l6 = f17812d;
                        if (c1841l6 == null) {
                            AbstractC3159y.y("viewModel");
                        } else {
                            c1841l2 = c1841l6;
                        }
                        if (c1841l2.f14224c.f2375b.f2331R) {
                            context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN").putExtra("EXTRA_FORCE", false));
                            return;
                        }
                        return;
                    }
                }
            }
            C3832b.b(C3832b.f38876a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, EnumC3833c.CONSOLE, null, 22);
            return;
        }
        choiceCmp.a(context, false);
    }

    public static final void forceDisplayUI(Activity activity) {
        AbstractC3159y.i(activity, "activity");
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            choiceCmp.a(activity, true);
        } else {
            C3832b.b(C3832b.f38876a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
        }
    }

    public static final GDPRData getGDPRData(Set<Integer> set) {
        if (INSTANCE.isViewModelAvailable$app_release()) {
            return new GDPRData(set);
        }
        return null;
    }

    public static /* synthetic */ GDPRData getGDPRData$default(Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = null;
        }
        return getGDPRData(set);
    }

    public static final NonIABData getNonIABData(Set<Integer> set) {
        boolean z8;
        Map<Integer, Boolean> map;
        C1841l c1841l = null;
        if (!INSTANCE.isViewModelAvailable$app_release()) {
            return null;
        }
        C1841l c1841l2 = f17812d;
        if (c1841l2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            c1841l = c1841l2;
        }
        if (c1841l.f14222a.i(N7.a.TCF_GDPR_APPLIES) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        String j8 = c1841l.f14222a.j(N7.a.NON_IAB_CONSENT_ENCODED);
        Map<Integer, Boolean> map2 = c1841l.f14223b.f39925A.getMap();
        if (set == null) {
            map = map2;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Boolean> entry : map2.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = linkedHashMap;
        }
        return new NonIABData(z8, false, false, j8, map);
    }

    public static /* synthetic */ NonIABData getNonIABData$default(Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = null;
        }
        return getNonIABData(set);
    }

    public static final void showCCPAScreen(Activity activity) {
        AbstractC3159y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            C1841l c1841l = f17812d;
            C1841l c1841l2 = null;
            if (c1841l == null) {
                AbstractC3159y.y("viewModel");
                c1841l = null;
            }
            if (c1841l.l()) {
                C1841l c1841l3 = f17812d;
                if (c1841l3 == null) {
                    AbstractC3159y.y("viewModel");
                    c1841l3 = null;
                }
                if (c1841l3.f14224c.f2375b.f2334b.contains("USP")) {
                    C1841l c1841l4 = f17812d;
                    if (c1841l4 == null) {
                        AbstractC3159y.y("viewModel");
                    } else {
                        c1841l2 = c1841l4;
                    }
                    if (c1841l2.k()) {
                        activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_CCPA_SCREEN"));
                        return;
                    }
                }
                C3832b.b(C3832b.f38876a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, EnumC3833c.CONSOLE, null, 22);
                return;
            }
        }
        C3832b.b(C3832b.f38876a, ChoiceError.INVALID_LOCATION, null, null, EnumC3833c.CONSOLE, null, 22);
    }

    public static final void showGBCScreen(Activity activity) {
        AbstractC3159y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            if (C1895i.f14840b) {
                activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_GBC_SCREEN"));
                return;
            } else {
                C3832b.b(C3832b.f38876a, ChoiceError.GBC_NOT_APPLICABLE, null, null, null, null, 30);
                return;
            }
        }
        C3832b.b(C3832b.f38876a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
    }

    public static final void showUSRegulationScreen(Activity activity) {
        AbstractC3159y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            C1841l c1841l = f17812d;
            C1841l c1841l2 = null;
            if (c1841l == null) {
                AbstractC3159y.y("viewModel");
                c1841l = null;
            }
            if (c1841l.l()) {
                C1841l c1841l3 = f17812d;
                if (c1841l3 == null) {
                    AbstractC3159y.y("viewModel");
                    c1841l3 = null;
                }
                if (c1841l3.o()) {
                    C1841l c1841l4 = f17812d;
                    if (c1841l4 == null) {
                        AbstractC3159y.y("viewModel");
                    } else {
                        c1841l2 = c1841l4;
                    }
                    if (!c1841l2.k()) {
                        C6.i.f1350a.b(O7.d.f7806a.h());
                    }
                    activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN").putExtra("EXTRA_FORCE", true));
                    return;
                }
                C3832b.b(C3832b.f38876a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, EnumC3833c.CONSOLE, null, 22);
                return;
            }
        }
        C3832b.b(C3832b.f38876a, ChoiceError.INVALID_LOCATION, null, null, EnumC3833c.CONSOLE, null, 22);
    }

    public static final void startChoice(Application application, String packageId, String pCode, ChoiceCmpCallback callback, ChoiceStyle resources) {
        String str;
        Typeface font;
        Typeface font2;
        q qVar;
        L7.c cVar;
        m mVar;
        o oVar;
        L7.k kVar;
        AbstractC3159y.i(application, "app");
        AbstractC3159y.i(packageId, "packageId");
        AbstractC3159y.i(pCode, "pCode");
        AbstractC3159y.i(callback, "callback");
        AbstractC3159y.i(resources, "choiceStyle");
        ChoiceCmp choiceCmp = INSTANCE;
        f17809a = callback;
        f17810b = packageId;
        choiceCmp.getClass();
        Matcher matcher = f17815g.matcher(pCode);
        if (matcher.matches()) {
            str = matcher.group(2);
        } else {
            str = null;
        }
        if (str == null) {
            C3832b.b(C3832b.f38876a, ChoiceError.INVALID_PCODE, null, null, null, null, 30);
            str = null;
        }
        if (str == null) {
            str = null;
        }
        if (str == null) {
            return;
        }
        f17811c = str;
        O7.d dVar = O7.d.f7806a;
        AbstractC3159y.i(application, "<set-?>");
        O7.d.f7807b = application;
        AbstractC3159y.i(resources, "resources");
        O7.d.f7809d = resources;
        Integer boldFont = resources.getBoldFont();
        if (boldFont == null) {
            font = null;
        } else {
            font = ResourcesCompat.getFont(dVar.b(), boldFont.intValue());
        }
        Integer regularFont = resources.getRegularFont();
        if (regularFont == null) {
            font2 = null;
        } else {
            font2 = ResourcesCompat.getFont(dVar.b(), regularFont.intValue());
        }
        O7.d.f7810e = new J7.b(font, font2);
        if (f17812d == null) {
            SharedStorage m8 = dVar.m();
            s n8 = dVar.n();
            E6.f j8 = dVar.j();
            if (O7.d.f7822q == null) {
                O7.d.f7822q = new r(dVar.b(), dVar.i(), dVar.a(), dVar.m(), dVar.l(), new M7.n(dVar.a()));
            }
            q qVar2 = O7.d.f7822q;
            if (qVar2 == null) {
                AbstractC3159y.y("gvlRepository_");
                qVar = null;
            } else {
                qVar = qVar2;
            }
            if (O7.d.f7823r == null) {
                O7.d.f7823r = new L7.d(dVar.i(), dVar.m(), dVar.l(), new M7.b(dVar.b(), dVar.a()));
            }
            L7.c cVar2 = O7.d.f7823r;
            if (cVar2 == null) {
                AbstractC3159y.y("cmpRepository_");
                cVar = null;
            } else {
                cVar = cVar2;
            }
            u k8 = dVar.k();
            w p8 = dVar.p();
            if (O7.d.f7828w == null) {
                O7.d.f7828w = new L7.n(dVar.i(), dVar.l(), new M7.g());
            }
            m mVar2 = O7.d.f7828w;
            if (mVar2 == null) {
                AbstractC3159y.y("geoIPRepository_");
                mVar = null;
            } else {
                mVar = mVar2;
            }
            if (O7.d.f7829x == null) {
                O7.d.f7829x = new p(dVar.i(), dVar.m(), dVar.l(), new M7.h());
            }
            o oVar2 = O7.d.f7829x;
            if (oVar2 == null) {
                AbstractC3159y.y("googleVendorsRepository_");
                oVar = null;
            } else {
                oVar = oVar2;
            }
            if (O7.d.f7804A == null) {
                O7.d.f7804A = new L7.l(dVar.a(), dVar.i(), dVar.m(), dVar.l(), new M7.f());
            }
            L7.k kVar2 = O7.d.f7804A;
            if (kVar2 == null) {
                AbstractC3159y.y("gbcRepository");
                kVar = null;
            } else {
                kVar = kVar2;
            }
            f17812d = new C1841l(m8, n8, j8, qVar, cVar, k8, p8, mVar, oVar, kVar, dVar.c());
            choiceCmp.a();
        }
        j applicationLifecycleCallback = new j();
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(applicationLifecycleCallback, "applicationLifecycleCallback");
        application.registerActivityLifecycleCallbacks(new O7.b(applicationLifecycleCallback));
    }

    public static /* synthetic */ void startChoice$default(Application application, String str, String str2, ChoiceCmpCallback choiceCmpCallback, ChoiceStyle choiceStyle, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            choiceStyle = new ChoiceStyle();
        }
        startChoice(application, str, str2, choiceCmpCallback, choiceStyle);
    }

    public final void a(Context context, boolean z8) {
        C1841l c1841l = f17812d;
        C1841l c1841l2 = null;
        if (c1841l == null) {
            AbstractC3159y.y("viewModel");
            c1841l = null;
        }
        if (!c1841l.l()) {
            C1841l c1841l3 = f17812d;
            if (c1841l3 == null) {
                AbstractC3159y.y("viewModel");
                c1841l3 = null;
            }
            if (c1841l3.f14224c.f2375b.f2334b.contains("GDPR") && c1841l3.b()) {
                C1841l c1841l4 = f17812d;
                if (c1841l4 == null) {
                    AbstractC3159y.y("viewModel");
                } else {
                    c1841l2 = c1841l4;
                }
                if (c1841l2.s() || z8) {
                    context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).addFlags(268435456).putExtra("EXTRA_ACTION", "ACTION_SHOW_CMP_DIALOG").putExtra("EXTRA_FORCE", z8));
                    return;
                }
                return;
            }
        }
        C3832b.b(C3832b.f38876a, ChoiceError.GDPR_NA, null, null, EnumC3833c.CONSOLE, null, 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.cmp.ChoiceCmp.b
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.cmp.ChoiceCmp$b r0 = (com.inmobi.cmp.ChoiceCmp.b) r0
            int r1 = r0.f17818c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17818c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$b r0 = new com.inmobi.cmp.ChoiceCmp$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17816a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f17818c
            java.lang.String r3 = "viewModel"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            L5.t.b(r8)
            goto L85
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            L5.t.b(r8)
            goto L5b
        L3b:
            L5.t.b(r8)
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f17812d
            if (r8 != 0) goto L46
            kotlin.jvm.internal.AbstractC3159y.y(r3)
            r8 = r6
        L46:
            r0.f17818c = r5
            r8.getClass()
            i6.I r2 = i6.C2812b0.b()
            b.g r5 = new b.g
            r5.<init>(r8, r6)
            java.lang.Object r8 = i6.AbstractC2825i.g(r2, r5, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            G5.c r8 = (G5.c) r8
            O7.d r2 = O7.d.f7806a
            java.lang.String r2 = "gbcPurpose"
            kotlin.jvm.internal.AbstractC3159y.i(r8, r2)
            O7.d.f7817l = r8
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f17812d
            if (r8 != 0) goto L6e
            kotlin.jvm.internal.AbstractC3159y.y(r3)
            goto L6f
        L6e:
            r6 = r8
        L6f:
            r6.getClass()
            c.i r8 = c.C1895i.f14839a
            boolean r8 = r6.m()
            c.C1895i.f14840b = r8
            com.inmobi.cmp.ChoiceCmp r8 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f17818c = r4
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            L5.I r8 = L5.I.f6487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.b(P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.cmp.ChoiceCmp.c
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.cmp.ChoiceCmp$c r0 = (com.inmobi.cmp.ChoiceCmp.c) r0
            int r1 = r0.f17821c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17821c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$c r0 = new com.inmobi.cmp.ChoiceCmp$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17819a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f17821c
            java.lang.String r3 = "viewModel"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            L5.t.b(r8)
            goto L84
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            L5.t.b(r8)
            goto L5b
        L3b:
            L5.t.b(r8)
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f17812d
            if (r8 != 0) goto L46
            kotlin.jvm.internal.AbstractC3159y.y(r3)
            r8 = r6
        L46:
            r0.f17821c = r5
            r8.getClass()
            i6.I r2 = i6.C2812b0.b()
            b.h r5 = new b.h
            r5.<init>(r8, r6)
            java.lang.Object r8 = i6.AbstractC2825i.g(r2, r5, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            J5.b r8 = (J5.b) r8
            b.l r2 = com.inmobi.cmp.ChoiceCmp.f17812d
            if (r2 != 0) goto L65
            kotlin.jvm.internal.AbstractC3159y.y(r3)
            r2 = r6
        L65:
            r2.f14235n = r8
            O7.d r2 = O7.d.f7806a
            if (r8 != 0) goto L6c
            goto L6e
        L6c:
            java.lang.String r6 = r8.f5503b
        L6e:
            if (r6 != 0) goto L72
            java.lang.String r6 = ""
        L72:
            java.lang.String r8 = "region"
            kotlin.jvm.internal.AbstractC3159y.i(r6, r8)
            O7.d.f7819n = r6
            com.inmobi.cmp.ChoiceCmp r8 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f17821c = r4
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r1) goto L84
            return r1
        L84:
            L5.I r8 = L5.I.f6487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.c(P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(P5.d r14) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.d(P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(P5.d r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.e(P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.cmp.ChoiceCmp.f
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.cmp.ChoiceCmp$f r0 = (com.inmobi.cmp.ChoiceCmp.f) r0
            int r1 = r0.f17830c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17830c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$f r0 = new com.inmobi.cmp.ChoiceCmp$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17828a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f17830c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r7)
            goto L71
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            L5.t.b(r7)
            goto L5b
        L38:
            L5.t.b(r7)
            b.l r7 = com.inmobi.cmp.ChoiceCmp.f17812d
            r2 = 0
            if (r7 != 0) goto L46
            java.lang.String r7 = "viewModel"
            kotlin.jvm.internal.AbstractC3159y.y(r7)
            r7 = r2
        L46:
            r0.f17830c = r4
            r7.getClass()
            i6.I r4 = i6.C2812b0.b()
            b.j r5 = new b.j
            r5.<init>(r7, r2)
            java.lang.Object r7 = i6.AbstractC2825i.g(r4, r5, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            C6.a r7 = (C6.a) r7
            O7.d r2 = O7.d.f7806a
            java.lang.String r2 = "mspaConfig"
            kotlin.jvm.internal.AbstractC3159y.i(r7, r2)
            O7.d.f7818m = r7
            com.inmobi.cmp.ChoiceCmp r7 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f17830c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.f(P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(P5.d r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.g(P5.d):java.lang.Object");
    }

    public final String getAppPackageId() {
        return f17810b;
    }

    public final ChoiceCmpCallback getCallback() {
        return f17809a;
    }

    public final C3998e getGoogleVendorList$app_release() {
        C1841l c1841l = f17812d;
        if (c1841l == null) {
            AbstractC3159y.y("viewModel");
            c1841l = null;
        }
        return c1841l.f14234m;
    }

    public final String getPCode() {
        return f17811c;
    }

    public final E6.f getPortalConfig$app_release() {
        C1841l c1841l = null;
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        C1841l c1841l2 = f17812d;
        if (c1841l2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            c1841l = c1841l2;
        }
        return c1841l.f14224c;
    }

    public final s getTcModel$app_release() {
        C1841l c1841l = null;
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        C1841l c1841l2 = f17812d;
        if (c1841l2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            c1841l = c1841l2;
        }
        return c1841l.f14223b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.cmp.ChoiceCmp.h
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.cmp.ChoiceCmp$h r0 = (com.inmobi.cmp.ChoiceCmp.h) r0
            int r1 = r0.f17836c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17836c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$h r0 = new com.inmobi.cmp.ChoiceCmp$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17834a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f17836c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            L5.t.b(r7)
            goto L5b
        L38:
            L5.t.b(r7)
            b.l r7 = com.inmobi.cmp.ChoiceCmp.f17812d
            r2 = 0
            if (r7 != 0) goto L46
            java.lang.String r7 = "viewModel"
            kotlin.jvm.internal.AbstractC3159y.y(r7)
            r7 = r2
        L46:
            r0.f17836c = r4
            r7.getClass()
            i6.I r4 = i6.C2812b0.b()
            b.k r5 = new b.k
            r5.<init>(r7, r2)
            java.lang.Object r7 = i6.AbstractC2825i.g(r4, r5, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            J7.r r7 = (J7.r) r7
            com.inmobi.cmp.ChoiceCmp r7 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f17836c = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.h(P5.d):java.lang.Object");
    }

    public final boolean isViewModelAvailable$app_release() {
        C1841l c1841l = f17812d;
        if (c1841l != null && c1841l.f14233l) {
            return true;
        }
        return false;
    }

    public final PingReturn ping$app_release(boolean z8, CmpStatus cmpStatus, DisplayStatus displayStatus) {
        Integer valueOf;
        Integer valueOf2;
        AbstractC3159y.i(cmpStatus, "cmpStatus");
        AbstractC3159y.i(displayStatus, "displayStatus");
        if (f17812d != null) {
            C1841l c1841l = f17812d;
            C1841l c1841l2 = null;
            if (c1841l == null) {
                AbstractC3159y.y("viewModel");
                c1841l = null;
            }
            Boolean valueOf3 = Boolean.valueOf(c1841l.b());
            s tcModel$app_release = getTcModel$app_release();
            if (tcModel$app_release == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(tcModel$app_release.f39945n);
            }
            String valueOf4 = String.valueOf(valueOf);
            s tcModel$app_release2 = getTcModel$app_release();
            if (tcModel$app_release2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(tcModel$app_release2.f39944m);
            }
            C1841l c1841l3 = f17812d;
            if (c1841l3 == null) {
                AbstractC3159y.y("viewModel");
                c1841l3 = null;
            }
            Integer valueOf5 = Integer.valueOf(c1841l3.i());
            C1841l c1841l4 = f17812d;
            if (c1841l4 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                c1841l2 = c1841l4;
            }
            return new PingReturn(valueOf3, z8, cmpStatus, displayStatus, MBridgeConstans.NATIVE_VIDEO_VERSION, valueOf4, valueOf2, valueOf5, Integer.valueOf(c1841l2.h()));
        }
        C3832b.b(C3832b.f38876a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
        return new PingReturn(null, false, CmpStatus.ERROR, DisplayStatus.HIDDEN, MBridgeConstans.NATIVE_VIDEO_VERSION, null, null, null, null);
    }

    public final void setAppPackageId(String str) {
        AbstractC3159y.i(str, "<set-?>");
        f17810b = str;
    }

    public final void setCallback(ChoiceCmpCallback choiceCmpCallback) {
        f17809a = choiceCmpCallback;
    }

    public final void setPCode(String str) {
        AbstractC3159y.i(str, "<set-?>");
        f17811c = str;
    }

    public final void a() {
        M m8 = f17813e;
        if (m8 == null) {
            m8 = N.a(U0.b(null, 1, null));
        }
        M m9 = m8;
        f17813e = m9;
        if (m9 == null) {
            return;
        }
        AbstractC2829k.d(m9, f17814f, null, new k(null), 2, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 651
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final java.lang.Object a(P5.d r26) {
        /*
            Method dump skipped, instructions count: 2882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.a(P5.d):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public static final class i extends P5.a implements J {
        public i(J.a aVar) {
            super(aVar);
        }

        @Override // i6.J
        public void handleException(P5.g gVar, Throwable th) {
        }
    }
}
