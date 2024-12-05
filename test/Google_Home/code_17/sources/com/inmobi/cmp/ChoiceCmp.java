package com.inmobi.cmp;

import B5.s;
import O5.I;
import O5.t;
import O7.m;
import O7.o;
import O7.p;
import O7.q;
import O7.r;
import O7.u;
import O7.w;
import P7.n;
import a6.InterfaceC1668n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import b.C1950l;
import c.C2001i;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.J;
import l6.M;
import l6.N;
import l6.U0;
import y5.C4209b;
import y5.EnumC4210c;

/* loaded from: classes4.dex */
public final class ChoiceCmp {

    /* renamed from: a */
    public static ChoiceCmpCallback f18864a = null;

    /* renamed from: b */
    public static String f18865b = "";

    /* renamed from: c */
    public static String f18866c = "";

    /* renamed from: d */
    public static C1950l f18867d;

    /* renamed from: e */
    public static M f18868e;
    public static final ChoiceCmp INSTANCE = new ChoiceCmp();

    /* renamed from: f */
    public static final J f18869f = new i(J.f34566m0);

    /* renamed from: g */
    public static final Pattern f18870g = Pattern.compile("^(p-)?([a-zA-Z0-9_-]{13})$");

    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC1668n {
        public a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new a((S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            t.b(obj);
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            ChoiceCmpCallback callback = choiceCmp.getCallback();
            if (callback != null) {
                callback.onCmpLoaded(choiceCmp.ping$app_release(true, CmpStatus.LOADED, DisplayStatus.HIDDEN));
            }
            R7.d dVar = R7.d.f9662a;
            if (R7.d.f9663b != null) {
                ChoiceCmp.access$showCmpDialog(choiceCmp, dVar.b());
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f18871a;

        /* renamed from: c */
        public int f18873c;

        public b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18871a = obj;
            this.f18873c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.b(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f18874a;

        /* renamed from: c */
        public int f18876c;

        public c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18874a = obj;
            this.f18876c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.c(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f18877a;

        /* renamed from: c */
        public int f18879c;

        public d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18877a = obj;
            this.f18879c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.d(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f18880a;

        /* renamed from: c */
        public int f18882c;

        public e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18880a = obj;
            this.f18882c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.e(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f18883a;

        /* renamed from: c */
        public int f18885c;

        public f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18883a = obj;
            this.f18885c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.f(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f18886a;

        /* renamed from: c */
        public int f18888c;

        public g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18886a = obj;
            this.f18888c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.g(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f18889a;

        /* renamed from: c */
        public int f18891c;

        public h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18889a = obj;
            this.f18891c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.h(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements R7.a {
        @Override // R7.a
        public void a() {
            C1950l c1950l = ChoiceCmp.f18867d;
            if (c1950l == null) {
                AbstractC3255y.y("viewModel");
                c1950l = null;
            }
            if (!c1950l.f15034l) {
                ChoiceCmp.INSTANCE.a();
            }
        }

        @Override // R7.a
        public void b() {
            M m8 = ChoiceCmp.f18868e;
            if (m8 != null) {
                N.d(m8, null, 1, null);
            }
            ChoiceCmp.f18868e = null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends l implements InterfaceC1668n {

        /* renamed from: a */
        public int f18892a;

        public k(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new k((S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f18892a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                this.f18892a = 1;
                if (ChoiceCmp.access$loadCmpInfo(choiceCmp, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
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
    public static final java.lang.Object access$loadCmpInfo(com.inmobi.cmp.ChoiceCmp r6, S5.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof b.C1939a
            if (r0 == 0) goto L16
            r0 = r7
            b.a r0 = (b.C1939a) r0
            int r1 = r0.f15005c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15005c = r1
            goto L1b
        L16:
            b.a r0 = new b.a
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r6 = r0.f15003a
            java.lang.Object r7 = T5.b.e()
            int r1 = r0.f15005c
            java.lang.String r2 = "viewModel"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            O5.t.b(r6)
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            O5.t.b(r6)
            goto L5e
        L3e:
            O5.t.b(r6)
            b.l r6 = com.inmobi.cmp.ChoiceCmp.f18867d
            if (r6 != 0) goto L49
            kotlin.jvm.internal.AbstractC3255y.y(r2)
            r6 = r5
        L49:
            r0.f15005c = r4
            r6.getClass()
            l6.I r1 = l6.C3347b0.b()
            b.d r4 = new b.d
            r4.<init>(r6, r5)
            java.lang.Object r6 = l6.AbstractC3360i.g(r1, r4, r0)
            if (r6 != r7) goto L5e
            goto L80
        L5e:
            B5.g r6 = (B5.g) r6
            b.l r1 = com.inmobi.cmp.ChoiceCmp.f18867d
            if (r1 != 0) goto L68
            kotlin.jvm.internal.AbstractC3255y.y(r2)
            goto L69
        L68:
            r5 = r1
        L69:
            r5.getClass()
            java.lang.String r1 = "cmpIab"
            kotlin.jvm.internal.AbstractC3255y.i(r6, r1)
            r5.f15038p = r6
            com.inmobi.cmp.ChoiceCmp r6 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f15005c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r7) goto L7e
            goto L80
        L7e:
            O5.I r7 = O5.I.f8278a
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$loadCmpInfo(com.inmobi.cmp.ChoiceCmp, S5.d):java.lang.Object");
    }

    public static final void access$showCmpDialog(ChoiceCmp choiceCmp, Context context) {
        choiceCmp.getClass();
        C1950l c1950l = f18867d;
        C1950l c1950l2 = null;
        if (c1950l == null) {
            AbstractC3255y.y("viewModel");
            c1950l = null;
        }
        if (c1950l.l()) {
            if (choiceCmp.isViewModelAvailable$app_release()) {
                C1950l c1950l3 = f18867d;
                if (c1950l3 == null) {
                    AbstractC3255y.y("viewModel");
                    c1950l3 = null;
                }
                if (c1950l3.o()) {
                    C1950l c1950l4 = f18867d;
                    if (c1950l4 == null) {
                        AbstractC3255y.y("viewModel");
                        c1950l4 = null;
                    }
                    H6.a coreConfig = c1950l4.f15025c.f3925b;
                    AbstractC3255y.i(coreConfig, "coreConfig");
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) coreConfig.f3873J);
                    sb.append(coreConfig.f3877N);
                    sb.append(coreConfig.f3878O);
                    String b8 = L7.b.b(sb.toString());
                    SharedStorage sharedStorage = c1950l4.f15023a;
                    Q7.a aVar = Q7.a.MSPA_PURPOSE_HASH;
                    if (!AbstractC3255y.d(b8, sharedStorage.j(aVar)) || c1950l4.j()) {
                        if (c1950l4.m()) {
                            c1950l4.f15023a.e(Q7.a.GBC_PURPOSE_HASH, c1950l4.e());
                        }
                        SharedStorage sharedStorage2 = c1950l4.f15023a;
                        H6.a coreConfig2 = c1950l4.f15025c.f3925b;
                        AbstractC3255y.i(coreConfig2, "coreConfig");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) coreConfig2.f3873J);
                        sb2.append(coreConfig2.f3877N);
                        sb2.append(coreConfig2.f3878O);
                        sharedStorage2.e(aVar, L7.b.b(sb2.toString()));
                        c1950l4.f15023a.b(Q7.a.MSPA_PURPOSE_CONSENT);
                        c1950l4.f15023a.b(Q7.a.MSPA_SENSITIVE_PURPOSE_CONSENT);
                        C1950l c1950l5 = f18867d;
                        if (c1950l5 == null) {
                            AbstractC3255y.y("viewModel");
                            c1950l5 = null;
                        }
                        if (!c1950l5.k()) {
                            F6.i.f2860a.b(R7.d.f9662a.h());
                        }
                        C1950l c1950l6 = f18867d;
                        if (c1950l6 == null) {
                            AbstractC3255y.y("viewModel");
                        } else {
                            c1950l2 = c1950l6;
                        }
                        if (c1950l2.f15025c.f3925b.f3881R) {
                            context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN").putExtra("EXTRA_FORCE", false));
                            return;
                        }
                        return;
                    }
                }
            }
            C4209b.b(C4209b.f41007a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, EnumC4210c.CONSOLE, null, 22);
            return;
        }
        choiceCmp.a(context, false);
    }

    public static final void forceDisplayUI(Activity activity) {
        AbstractC3255y.i(activity, "activity");
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            choiceCmp.a(activity, true);
        } else {
            C4209b.b(C4209b.f41007a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
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
        C1950l c1950l = null;
        if (!INSTANCE.isViewModelAvailable$app_release()) {
            return null;
        }
        C1950l c1950l2 = f18867d;
        if (c1950l2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            c1950l = c1950l2;
        }
        if (c1950l.f15023a.i(Q7.a.TCF_GDPR_APPLIES) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        String j8 = c1950l.f15023a.j(Q7.a.NON_IAB_CONSENT_ENCODED);
        Map<Integer, Boolean> map2 = c1950l.f15024b.f969A.getMap();
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
        AbstractC3255y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            C1950l c1950l = f18867d;
            C1950l c1950l2 = null;
            if (c1950l == null) {
                AbstractC3255y.y("viewModel");
                c1950l = null;
            }
            if (c1950l.l()) {
                C1950l c1950l3 = f18867d;
                if (c1950l3 == null) {
                    AbstractC3255y.y("viewModel");
                    c1950l3 = null;
                }
                if (c1950l3.f15025c.f3925b.f3884b.contains("USP")) {
                    C1950l c1950l4 = f18867d;
                    if (c1950l4 == null) {
                        AbstractC3255y.y("viewModel");
                    } else {
                        c1950l2 = c1950l4;
                    }
                    if (c1950l2.k()) {
                        activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_CCPA_SCREEN"));
                        return;
                    }
                }
                C4209b.b(C4209b.f41007a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, EnumC4210c.CONSOLE, null, 22);
                return;
            }
        }
        C4209b.b(C4209b.f41007a, ChoiceError.INVALID_LOCATION, null, null, EnumC4210c.CONSOLE, null, 22);
    }

    public static final void showGBCScreen(Activity activity) {
        AbstractC3255y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            if (C2001i.f15552b) {
                activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_GBC_SCREEN"));
                return;
            } else {
                C4209b.b(C4209b.f41007a, ChoiceError.GBC_NOT_APPLICABLE, null, null, null, null, 30);
                return;
            }
        }
        C4209b.b(C4209b.f41007a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
    }

    public static final void showUSRegulationScreen(Activity activity) {
        AbstractC3255y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            C1950l c1950l = f18867d;
            C1950l c1950l2 = null;
            if (c1950l == null) {
                AbstractC3255y.y("viewModel");
                c1950l = null;
            }
            if (c1950l.l()) {
                C1950l c1950l3 = f18867d;
                if (c1950l3 == null) {
                    AbstractC3255y.y("viewModel");
                    c1950l3 = null;
                }
                if (c1950l3.o()) {
                    C1950l c1950l4 = f18867d;
                    if (c1950l4 == null) {
                        AbstractC3255y.y("viewModel");
                    } else {
                        c1950l2 = c1950l4;
                    }
                    if (!c1950l2.k()) {
                        F6.i.f2860a.b(R7.d.f9662a.h());
                    }
                    activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN").putExtra("EXTRA_FORCE", true));
                    return;
                }
                C4209b.b(C4209b.f41007a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, EnumC4210c.CONSOLE, null, 22);
                return;
            }
        }
        C4209b.b(C4209b.f41007a, ChoiceError.INVALID_LOCATION, null, null, EnumC4210c.CONSOLE, null, 22);
    }

    public static final void startChoice(Application application, String packageId, String pCode, ChoiceCmpCallback callback, ChoiceStyle resources) {
        String str;
        Typeface font;
        Typeface font2;
        q qVar;
        O7.c cVar;
        m mVar;
        o oVar;
        O7.k kVar;
        AbstractC3255y.i(application, "app");
        AbstractC3255y.i(packageId, "packageId");
        AbstractC3255y.i(pCode, "pCode");
        AbstractC3255y.i(callback, "callback");
        AbstractC3255y.i(resources, "choiceStyle");
        ChoiceCmp choiceCmp = INSTANCE;
        f18864a = callback;
        f18865b = packageId;
        choiceCmp.getClass();
        Matcher matcher = f18870g.matcher(pCode);
        if (matcher.matches()) {
            str = matcher.group(2);
        } else {
            str = null;
        }
        if (str == null) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_PCODE, null, null, null, null, 30);
            str = null;
        }
        if (str == null) {
            str = null;
        }
        if (str == null) {
            return;
        }
        f18866c = str;
        R7.d dVar = R7.d.f9662a;
        AbstractC3255y.i(application, "<set-?>");
        R7.d.f9663b = application;
        AbstractC3255y.i(resources, "resources");
        R7.d.f9665d = resources;
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
        R7.d.f9666e = new M7.b(font, font2);
        if (f18867d == null) {
            SharedStorage m8 = dVar.m();
            s n8 = dVar.n();
            H6.f j8 = dVar.j();
            if (R7.d.f9678q == null) {
                R7.d.f9678q = new r(dVar.b(), dVar.i(), dVar.a(), dVar.m(), dVar.l(), new n(dVar.a()));
            }
            q qVar2 = R7.d.f9678q;
            if (qVar2 == null) {
                AbstractC3255y.y("gvlRepository_");
                qVar = null;
            } else {
                qVar = qVar2;
            }
            if (R7.d.f9679r == null) {
                R7.d.f9679r = new O7.d(dVar.i(), dVar.m(), dVar.l(), new P7.b(dVar.b(), dVar.a()));
            }
            O7.c cVar2 = R7.d.f9679r;
            if (cVar2 == null) {
                AbstractC3255y.y("cmpRepository_");
                cVar = null;
            } else {
                cVar = cVar2;
            }
            u k8 = dVar.k();
            w p8 = dVar.p();
            if (R7.d.f9684w == null) {
                R7.d.f9684w = new O7.n(dVar.i(), dVar.l(), new P7.g());
            }
            m mVar2 = R7.d.f9684w;
            if (mVar2 == null) {
                AbstractC3255y.y("geoIPRepository_");
                mVar = null;
            } else {
                mVar = mVar2;
            }
            if (R7.d.f9685x == null) {
                R7.d.f9685x = new p(dVar.i(), dVar.m(), dVar.l(), new P7.h());
            }
            o oVar2 = R7.d.f9685x;
            if (oVar2 == null) {
                AbstractC3255y.y("googleVendorsRepository_");
                oVar = null;
            } else {
                oVar = oVar2;
            }
            if (R7.d.f9660A == null) {
                R7.d.f9660A = new O7.l(dVar.a(), dVar.i(), dVar.m(), dVar.l(), new P7.f());
            }
            O7.k kVar2 = R7.d.f9660A;
            if (kVar2 == null) {
                AbstractC3255y.y("gbcRepository");
                kVar = null;
            } else {
                kVar = kVar2;
            }
            f18867d = new C1950l(m8, n8, j8, qVar, cVar, k8, p8, mVar, oVar, kVar, dVar.c());
            choiceCmp.a();
        }
        j applicationLifecycleCallback = new j();
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(applicationLifecycleCallback, "applicationLifecycleCallback");
        application.registerActivityLifecycleCallbacks(new R7.b(applicationLifecycleCallback));
    }

    public static /* synthetic */ void startChoice$default(Application application, String str, String str2, ChoiceCmpCallback choiceCmpCallback, ChoiceStyle choiceStyle, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            choiceStyle = new ChoiceStyle();
        }
        startChoice(application, str, str2, choiceCmpCallback, choiceStyle);
    }

    public final void a(Context context, boolean z8) {
        C1950l c1950l = f18867d;
        C1950l c1950l2 = null;
        if (c1950l == null) {
            AbstractC3255y.y("viewModel");
            c1950l = null;
        }
        if (!c1950l.l()) {
            C1950l c1950l3 = f18867d;
            if (c1950l3 == null) {
                AbstractC3255y.y("viewModel");
                c1950l3 = null;
            }
            if (c1950l3.f15025c.f3925b.f3884b.contains("GDPR") && c1950l3.b()) {
                C1950l c1950l4 = f18867d;
                if (c1950l4 == null) {
                    AbstractC3255y.y("viewModel");
                } else {
                    c1950l2 = c1950l4;
                }
                if (c1950l2.s() || z8) {
                    context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).addFlags(268435456).putExtra("EXTRA_ACTION", "ACTION_SHOW_CMP_DIALOG").putExtra("EXTRA_FORCE", z8));
                    return;
                }
                return;
            }
        }
        C4209b.b(C4209b.f41007a, ChoiceError.GDPR_NA, null, null, EnumC4210c.CONSOLE, null, 22);
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
    public final java.lang.Object b(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.cmp.ChoiceCmp.b
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.cmp.ChoiceCmp$b r0 = (com.inmobi.cmp.ChoiceCmp.b) r0
            int r1 = r0.f18873c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18873c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$b r0 = new com.inmobi.cmp.ChoiceCmp$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18871a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f18873c
            java.lang.String r3 = "viewModel"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            O5.t.b(r8)
            goto L85
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            O5.t.b(r8)
            goto L5b
        L3b:
            O5.t.b(r8)
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f18867d
            if (r8 != 0) goto L46
            kotlin.jvm.internal.AbstractC3255y.y(r3)
            r8 = r6
        L46:
            r0.f18873c = r5
            r8.getClass()
            l6.I r2 = l6.C3347b0.b()
            b.g r5 = new b.g
            r5.<init>(r8, r6)
            java.lang.Object r8 = l6.AbstractC3360i.g(r2, r5, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            J5.c r8 = (J5.c) r8
            R7.d r2 = R7.d.f9662a
            java.lang.String r2 = "gbcPurpose"
            kotlin.jvm.internal.AbstractC3255y.i(r8, r2)
            R7.d.f9673l = r8
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f18867d
            if (r8 != 0) goto L6e
            kotlin.jvm.internal.AbstractC3255y.y(r3)
            goto L6f
        L6e:
            r6 = r8
        L6f:
            r6.getClass()
            c.i r8 = c.C2001i.f15551a
            boolean r8 = r6.m()
            c.C2001i.f15552b = r8
            com.inmobi.cmp.ChoiceCmp r8 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f18873c = r4
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.b(S5.d):java.lang.Object");
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
    public final java.lang.Object c(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.cmp.ChoiceCmp.c
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.cmp.ChoiceCmp$c r0 = (com.inmobi.cmp.ChoiceCmp.c) r0
            int r1 = r0.f18876c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18876c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$c r0 = new com.inmobi.cmp.ChoiceCmp$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18874a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f18876c
            java.lang.String r3 = "viewModel"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            O5.t.b(r8)
            goto L84
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            O5.t.b(r8)
            goto L5b
        L3b:
            O5.t.b(r8)
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f18867d
            if (r8 != 0) goto L46
            kotlin.jvm.internal.AbstractC3255y.y(r3)
            r8 = r6
        L46:
            r0.f18876c = r5
            r8.getClass()
            l6.I r2 = l6.C3347b0.b()
            b.h r5 = new b.h
            r5.<init>(r8, r6)
            java.lang.Object r8 = l6.AbstractC3360i.g(r2, r5, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            M5.b r8 = (M5.b) r8
            b.l r2 = com.inmobi.cmp.ChoiceCmp.f18867d
            if (r2 != 0) goto L65
            kotlin.jvm.internal.AbstractC3255y.y(r3)
            r2 = r6
        L65:
            r2.f15036n = r8
            R7.d r2 = R7.d.f9662a
            if (r8 != 0) goto L6c
            goto L6e
        L6c:
            java.lang.String r6 = r8.f7209b
        L6e:
            if (r6 != 0) goto L72
            java.lang.String r6 = ""
        L72:
            java.lang.String r8 = "region"
            kotlin.jvm.internal.AbstractC3255y.i(r6, r8)
            R7.d.f9675n = r6
            com.inmobi.cmp.ChoiceCmp r8 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f18876c = r4
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r1) goto L84
            return r1
        L84:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.c(S5.d):java.lang.Object");
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
    public final java.lang.Object d(S5.d r14) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.d(S5.d):java.lang.Object");
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
    public final java.lang.Object e(S5.d r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.e(S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.cmp.ChoiceCmp.f
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.cmp.ChoiceCmp$f r0 = (com.inmobi.cmp.ChoiceCmp.f) r0
            int r1 = r0.f18885c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18885c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$f r0 = new com.inmobi.cmp.ChoiceCmp$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18883a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f18885c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r7)
            goto L71
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            O5.t.b(r7)
            goto L5b
        L38:
            O5.t.b(r7)
            b.l r7 = com.inmobi.cmp.ChoiceCmp.f18867d
            r2 = 0
            if (r7 != 0) goto L46
            java.lang.String r7 = "viewModel"
            kotlin.jvm.internal.AbstractC3255y.y(r7)
            r7 = r2
        L46:
            r0.f18885c = r4
            r7.getClass()
            l6.I r4 = l6.C3347b0.b()
            b.j r5 = new b.j
            r5.<init>(r7, r2)
            java.lang.Object r7 = l6.AbstractC3360i.g(r4, r5, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            F6.a r7 = (F6.a) r7
            R7.d r2 = R7.d.f9662a
            java.lang.String r2 = "mspaConfig"
            kotlin.jvm.internal.AbstractC3255y.i(r7, r2)
            R7.d.f9674m = r7
            com.inmobi.cmp.ChoiceCmp r7 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f18885c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.f(S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(S5.d r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.g(S5.d):java.lang.Object");
    }

    public final String getAppPackageId() {
        return f18865b;
    }

    public final ChoiceCmpCallback getCallback() {
        return f18864a;
    }

    public final B5.e getGoogleVendorList$app_release() {
        C1950l c1950l = f18867d;
        if (c1950l == null) {
            AbstractC3255y.y("viewModel");
            c1950l = null;
        }
        return c1950l.f15035m;
    }

    public final String getPCode() {
        return f18866c;
    }

    public final H6.f getPortalConfig$app_release() {
        C1950l c1950l = null;
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        C1950l c1950l2 = f18867d;
        if (c1950l2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            c1950l = c1950l2;
        }
        return c1950l.f15025c;
    }

    public final s getTcModel$app_release() {
        C1950l c1950l = null;
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        C1950l c1950l2 = f18867d;
        if (c1950l2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            c1950l = c1950l2;
        }
        return c1950l.f15024b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.cmp.ChoiceCmp.h
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.cmp.ChoiceCmp$h r0 = (com.inmobi.cmp.ChoiceCmp.h) r0
            int r1 = r0.f18891c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18891c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$h r0 = new com.inmobi.cmp.ChoiceCmp$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18889a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f18891c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            O5.t.b(r7)
            goto L5b
        L38:
            O5.t.b(r7)
            b.l r7 = com.inmobi.cmp.ChoiceCmp.f18867d
            r2 = 0
            if (r7 != 0) goto L46
            java.lang.String r7 = "viewModel"
            kotlin.jvm.internal.AbstractC3255y.y(r7)
            r7 = r2
        L46:
            r0.f18891c = r4
            r7.getClass()
            l6.I r4 = l6.C3347b0.b()
            b.k r5 = new b.k
            r5.<init>(r7, r2)
            java.lang.Object r7 = l6.AbstractC3360i.g(r4, r5, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            M7.r r7 = (M7.r) r7
            com.inmobi.cmp.ChoiceCmp r7 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f18891c = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.h(S5.d):java.lang.Object");
    }

    public final boolean isViewModelAvailable$app_release() {
        C1950l c1950l = f18867d;
        if (c1950l != null && c1950l.f15034l) {
            return true;
        }
        return false;
    }

    public final PingReturn ping$app_release(boolean z8, CmpStatus cmpStatus, DisplayStatus displayStatus) {
        Integer valueOf;
        Integer valueOf2;
        AbstractC3255y.i(cmpStatus, "cmpStatus");
        AbstractC3255y.i(displayStatus, "displayStatus");
        if (f18867d != null) {
            C1950l c1950l = f18867d;
            C1950l c1950l2 = null;
            if (c1950l == null) {
                AbstractC3255y.y("viewModel");
                c1950l = null;
            }
            Boolean valueOf3 = Boolean.valueOf(c1950l.b());
            s tcModel$app_release = getTcModel$app_release();
            if (tcModel$app_release == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(tcModel$app_release.f989n);
            }
            String valueOf4 = String.valueOf(valueOf);
            s tcModel$app_release2 = getTcModel$app_release();
            if (tcModel$app_release2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(tcModel$app_release2.f988m);
            }
            C1950l c1950l3 = f18867d;
            if (c1950l3 == null) {
                AbstractC3255y.y("viewModel");
                c1950l3 = null;
            }
            Integer valueOf5 = Integer.valueOf(c1950l3.i());
            C1950l c1950l4 = f18867d;
            if (c1950l4 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                c1950l2 = c1950l4;
            }
            return new PingReturn(valueOf3, z8, cmpStatus, displayStatus, MBridgeConstans.NATIVE_VIDEO_VERSION, valueOf4, valueOf2, valueOf5, Integer.valueOf(c1950l2.h()));
        }
        C4209b.b(C4209b.f41007a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
        return new PingReturn(null, false, CmpStatus.ERROR, DisplayStatus.HIDDEN, MBridgeConstans.NATIVE_VIDEO_VERSION, null, null, null, null);
    }

    public final void setAppPackageId(String str) {
        AbstractC3255y.i(str, "<set-?>");
        f18865b = str;
    }

    public final void setCallback(ChoiceCmpCallback choiceCmpCallback) {
        f18864a = choiceCmpCallback;
    }

    public final void setPCode(String str) {
        AbstractC3255y.i(str, "<set-?>");
        f18866c = str;
    }

    public final void a() {
        M m8 = f18868e;
        if (m8 == null) {
            m8 = N.a(U0.b(null, 1, null));
        }
        M m9 = m8;
        f18868e = m9;
        if (m9 == null) {
            return;
        }
        AbstractC3364k.d(m9, f18869f, null, new k(null), 2, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 651
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final java.lang.Object a(S5.d r26) {
        /*
            Method dump skipped, instructions count: 2882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.a(S5.d):java.lang.Object");
    }

    /* loaded from: classes4.dex */
    public static final class i extends S5.a implements J {
        public i(J.a aVar) {
            super(aVar);
        }

        @Override // l6.J
        public void handleException(S5.g gVar, Throwable th) {
        }
    }
}
