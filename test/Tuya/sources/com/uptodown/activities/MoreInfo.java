package com.uptodown.activities;

import E4.j;
import L5.InterfaceC1227k;
import T4.C1362b0;
import T4.N;
import U4.V0;
import X4.C1498h;
import X4.C1501k;
import X4.C1505o;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.activities.MoreInfo;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l5.C3312F;
import l5.C3323k;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class MoreInfo extends AbstractActivityC2489a {

    /* renamed from: P, reason: collision with root package name */
    private V0 f28517P;

    /* renamed from: Q, reason: collision with root package name */
    private C1498h f28518Q;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList f28519R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f28520S;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f28521T;

    /* renamed from: N, reason: collision with root package name */
    private final LifecycleCoroutineScope f28515N = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28516O = L5.l.b(new b());

    /* renamed from: U, reason: collision with root package name */
    private final int f28522U = 2;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C1505o f28523a;

        public a(C1505o c1505o) {
            this.f28523a = c1505o;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (MoreInfo.this.f28517P != null) {
                V0 v02 = MoreInfo.this.f28517P;
                AbstractC3159y.f(v02);
                C1505o c1505o = this.f28523a;
                if (c1505o != null) {
                    str = c1505o.Y();
                } else {
                    str = null;
                }
                v02.I(str);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return N.c(MoreInfo.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28526a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28528a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MoreInfo f28529b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MoreInfo moreInfo, P5.d dVar) {
                super(2, dVar);
                this.f28529b = moreInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28529b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28528a == 0) {
                    L5.t.b(obj);
                    ArrayList arrayList = this.f28529b.f28519R;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        this.f28529b.z3().f10203A.setVisibility(0);
                        TextView textView = this.f28529b.z3().f10229T;
                        j.a aVar = E4.j.f2274g;
                        textView.setTypeface(aVar.t());
                        this.f28529b.z3().f10230U.setTypeface(aVar.u());
                        ArrayList arrayList2 = this.f28529b.f28519R;
                        AbstractC3159y.f(arrayList2);
                        Iterator it = arrayList2.iterator();
                        String str = null;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str == null) {
                                str = str2;
                            } else {
                                str = str + ", " + str2;
                            }
                        }
                        this.f28529b.z3().f10230U.setText(str);
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            Object e8 = Q5.b.e();
            int i9 = this.f28526a;
            if (i9 != 0) {
                if (i9 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                Context applicationContext = MoreInfo.this.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                C3312F c3312f = new C3312F(applicationContext);
                C1498h c1498h = MoreInfo.this.f28518Q;
                AbstractC3159y.f(c1498h);
                X4.I l8 = c3312f.l(c1498h.i());
                if (!l8.b() && l8.d() != null) {
                    String d8 = l8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = l8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA) && (jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                            MoreInfo.this.f28519R = new ArrayList();
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                ArrayList arrayList = MoreInfo.this.f28519R;
                                AbstractC3159y.f(arrayList);
                                arrayList.add(jSONArray.get(i10).toString());
                            }
                        }
                        J0 c8 = C2812b0.c();
                        a aVar = new a(MoreInfo.this, null);
                        this.f28526a = 1;
                        if (AbstractC2825i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28530a;

        /* renamed from: b, reason: collision with root package name */
        Object f28531b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28532c;

        /* renamed from: e, reason: collision with root package name */
        int f28534e;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28532c = obj;
            this.f28534e |= Integer.MIN_VALUE;
            return MoreInfo.this.A3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28535a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f28537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T t8, P5.d dVar) {
            super(2, dVar);
            this.f28537c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28537c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            Q5.b.e();
            if (this.f28535a == 0) {
                L5.t.b(obj);
                Context applicationContext = MoreInfo.this.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                C3312F c3312f = new C3312F(applicationContext);
                C1498h c1498h = MoreInfo.this.f28518Q;
                AbstractC3159y.f(c1498h);
                X4.I n8 = c3312f.n(c1498h.i());
                if (!n8.b() && n8.d() != null) {
                    String d8 = n8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = n8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA) && (jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                            this.f28537c.f33761a = new ArrayList();
                            int length = jSONArray.length();
                            for (int i9 = 0; i9 < length; i9++) {
                                Object obj2 = this.f28537c.f33761a;
                                AbstractC3159y.f(obj2);
                                ((ArrayList) obj2).add(jSONArray.getString(i9));
                            }
                        }
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28538a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f28539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MoreInfo f28540c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t8, MoreInfo moreInfo, P5.d dVar) {
            super(2, dVar);
            this.f28539b = t8;
            this.f28540c = moreInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(final MoreInfo moreInfo, View view) {
            if (moreInfo.z3().f10278v.getVisibility() == 0) {
                moreInfo.z3().f10278v.setVisibility(8);
                moreInfo.z3().f10256k.setImageResource(R.drawable.vector_add);
            } else {
                moreInfo.z3().f10278v.setVisibility(0);
                moreInfo.z3().f10256k.setImageResource(R.drawable.vector_remove);
                moreInfo.z3().f10227R.post(new Runnable() { // from class: com.uptodown.activities.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        MoreInfo.f.m(MoreInfo.this);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(MoreInfo moreInfo) {
            moreInfo.z3().f10227R.smoothScrollTo(0, moreInfo.z3().f10218I.getTop());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f28539b, this.f28540c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28538a == 0) {
                L5.t.b(obj);
                Collection collection = (Collection) this.f28539b.f33761a;
                if (collection != null && !collection.isEmpty()) {
                    this.f28540c.z3().f10218I.setVisibility(0);
                    TextView textView = this.f28540c.z3().f10259l0;
                    j.a aVar = E4.j.f2274g;
                    textView.setTypeface(aVar.t());
                    this.f28540c.z3().f10261m0.setTypeface(aVar.u());
                    TextView textView2 = this.f28540c.z3().f10261m0;
                    Object obj2 = this.f28539b.f33761a;
                    AbstractC3159y.f(obj2);
                    textView2.setText(String.valueOf(((ArrayList) obj2).size()));
                    RelativeLayout relativeLayout = this.f28540c.z3().f10218I;
                    final MoreInfo moreInfo = this.f28540c;
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MoreInfo.f.l(MoreInfo.this, view);
                        }
                    });
                    MoreInfo moreInfo2 = this.f28540c;
                    moreInfo2.H3((ArrayList) this.f28539b.f33761a, moreInfo2.z3().f10278v);
                } else {
                    this.f28540c.z3().f10218I.setVisibility(8);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28541a;

        /* renamed from: b, reason: collision with root package name */
        Object f28542b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28543c;

        /* renamed from: e, reason: collision with root package name */
        int f28545e;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28543c = obj;
            this.f28545e |= Integer.MIN_VALUE;
            return MoreInfo.this.B3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28546a;

        h(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28546a == 0) {
                L5.t.b(obj);
                MoreInfo.this.z3().f10286z.f10185b.setVisibility(0);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28548a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f28550c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Q q8, P5.d dVar) {
            super(2, dVar);
            this.f28550c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f28550c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            Q5.b.e();
            if (this.f28548a == 0) {
                L5.t.b(obj);
                try {
                    Context applicationContext = MoreInfo.this.getApplicationContext();
                    AbstractC3159y.h(applicationContext, "applicationContext");
                    C3312F c3312f = new C3312F(applicationContext);
                    C1498h c1498h = MoreInfo.this.f28518Q;
                    AbstractC3159y.f(c1498h);
                    X4.I M8 = c3312f.M(c1498h.i());
                    if (!M8.b() && M8.d() != null) {
                        String d8 = M8.d();
                        AbstractC3159y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = M8.d();
                            AbstractC3159y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                this.f28550c.f33759a = jSONObject2.getInt("success");
                            }
                            if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            } else {
                                jSONObject = null;
                            }
                            if (this.f28550c.f33759a == 1 && jSONObject != null) {
                                MoreInfo.this.f28520S = new ArrayList();
                                if (!jSONObject.isNull("permissions_concern")) {
                                    JSONArray jSONArray = jSONObject.getJSONArray("permissions_concern");
                                    int length = jSONArray.length();
                                    for (int i8 = 0; i8 < length; i8++) {
                                        X4.B b8 = new X4.B();
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i8);
                                        AbstractC3159y.h(jSONObject3, "jsonArrayPermissions.getJSONObject(i)");
                                        b8.a(jSONObject3);
                                        ArrayList arrayList = MoreInfo.this.f28520S;
                                        AbstractC3159y.f(arrayList);
                                        arrayList.add(b8);
                                    }
                                }
                                MoreInfo.this.f28521T = new ArrayList();
                                if (!jSONObject.isNull("permissions")) {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray("permissions");
                                    int length2 = jSONArray2.length();
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        X4.B b9 = new X4.B();
                                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i9);
                                        AbstractC3159y.h(jSONObject4, "jsonArrayPermissions.getJSONObject(i)");
                                        b9.a(jSONObject4);
                                        ArrayList arrayList2 = MoreInfo.this.f28521T;
                                        AbstractC3159y.f(arrayList2);
                                        arrayList2.add(b9);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28551a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f28552b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MoreInfo f28553c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Q q8, MoreInfo moreInfo, P5.d dVar) {
            super(2, dVar);
            this.f28552b = q8;
            this.f28553c = moreInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f28552b, this.f28553c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Q5.b.e();
            if (this.f28551a == 0) {
                L5.t.b(obj);
                if (this.f28552b.f33759a == 1) {
                    this.f28553c.z3().f10222M.setVisibility(0);
                    ArrayList arrayList = this.f28553c.f28520S;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        MoreInfo moreInfo = this.f28553c;
                        moreInfo.O3(moreInfo.f28520S, this.f28553c.z3().f10276u);
                        ArrayList arrayList2 = this.f28553c.f28520S;
                        AbstractC3159y.f(arrayList2);
                        i8 = arrayList2.size();
                    } else {
                        this.f28553c.z3().f10222M.setVisibility(8);
                        i8 = 0;
                    }
                    ArrayList arrayList3 = this.f28553c.f28521T;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        MoreInfo moreInfo2 = this.f28553c;
                        moreInfo2.O3(moreInfo2.f28521T, this.f28553c.z3().f10282x);
                        ArrayList arrayList4 = this.f28553c.f28521T;
                        AbstractC3159y.f(arrayList4);
                        i8 += arrayList4.size();
                    }
                    C1498h c1498h = this.f28553c.f28518Q;
                    if (c1498h != null && c1498h.A0() == 0) {
                        this.f28553c.z3().f10281w0.setText(String.valueOf(i8));
                    }
                } else {
                    this.f28553c.z3().f10222M.setVisibility(8);
                }
                this.f28553c.z3().f10286z.f10185b.setVisibility(8);
                this.f28553c.z3().f10227R.setVisibility(0);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28554a;

        k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28554a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f28554a = 1;
                if (moreInfo.B3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28556a;

        l(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28556a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f28556a = 1;
                if (moreInfo.y3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28558a;

        m(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28558a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f28558a = 1;
                if (moreInfo.A3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A3(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.MoreInfo.d
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.MoreInfo$d r0 = (com.uptodown.activities.MoreInfo.d) r0
            int r1 = r0.f28534e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28534e = r1
            goto L18
        L13:
            com.uptodown.activities.MoreInfo$d r0 = new com.uptodown.activities.MoreInfo$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f28532c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f28534e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r8)
            goto L76
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f28531b
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r4 = r0.f28530a
            com.uptodown.activities.MoreInfo r4 = (com.uptodown.activities.MoreInfo) r4
            L5.t.b(r8)
            goto L60
        L41:
            L5.t.b(r8)
            kotlin.jvm.internal.T r2 = new kotlin.jvm.internal.T
            r2.<init>()
            i6.I r8 = i6.C2812b0.b()
            com.uptodown.activities.MoreInfo$e r6 = new com.uptodown.activities.MoreInfo$e
            r6.<init>(r2, r5)
            r0.f28530a = r7
            r0.f28531b = r2
            r0.f28534e = r4
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r6, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r4 = r7
        L60:
            i6.J0 r8 = i6.C2812b0.c()
            com.uptodown.activities.MoreInfo$f r6 = new com.uptodown.activities.MoreInfo$f
            r6.<init>(r2, r4, r5)
            r0.f28530a = r5
            r0.f28531b = r5
            r0.f28534e = r3
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r6, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            L5.I r8 = L5.I.f6487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.A3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B3(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.MoreInfo.g
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.MoreInfo$g r0 = (com.uptodown.activities.MoreInfo.g) r0
            int r1 = r0.f28545e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28545e = r1
            goto L18
        L13:
            com.uptodown.activities.MoreInfo$g r0 = new com.uptodown.activities.MoreInfo$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28543c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f28545e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            L5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f28542b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r4 = r0.f28541a
            com.uptodown.activities.MoreInfo r4 = (com.uptodown.activities.MoreInfo) r4
            L5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f28542b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r5 = r0.f28541a
            com.uptodown.activities.MoreInfo r5 = (com.uptodown.activities.MoreInfo) r5
            L5.t.b(r9)
            goto L70
        L50:
            L5.t.b(r9)
            kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
            r9.<init>()
            i6.J0 r2 = i6.C2812b0.c()
            com.uptodown.activities.MoreInfo$h r7 = new com.uptodown.activities.MoreInfo$h
            r7.<init>(r6)
            r0.f28541a = r8
            r0.f28542b = r9
            r0.f28545e = r5
            java.lang.Object r2 = i6.AbstractC2825i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            i6.I r9 = i6.C2812b0.b()
            com.uptodown.activities.MoreInfo$i r7 = new com.uptodown.activities.MoreInfo$i
            r7.<init>(r2, r6)
            r0.f28541a = r5
            r0.f28542b = r2
            r0.f28545e = r4
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            i6.J0 r9 = i6.C2812b0.c()
            com.uptodown.activities.MoreInfo$j r5 = new com.uptodown.activities.MoreInfo$j
            r5.<init>(r2, r4, r6)
            r0.f28541a = r6
            r0.f28542b = r6
            r0.f28545e = r3
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            L5.I r9 = L5.I.f6487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.B3(P5.d):java.lang.Object");
    }

    private final void C3(final TextView textView, final View view) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: A4.t1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MoreInfo.D3(textView, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(final TextView tv, final MoreInfo this$0, final View view) {
        AbstractC3159y.i(tv, "$tv");
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(view, "$view");
        if (n5.v.a(tv)) {
            tv.setOnClickListener(new View.OnClickListener() { // from class: A4.u1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MoreInfo.E3(MoreInfo.this, tv, view, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(MoreInfo this$0, TextView tv, View view, View view2) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(tv, "$tv");
        AbstractC3159y.i(view, "$view");
        this$0.w3(tv, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(MoreInfo this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        AbstractC3159y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1362b0 c8 = C1362b0.c(LayoutInflater.from(getApplicationContext()));
            AbstractC3159y.h(c8, "inflate(LayoutInflater.from(applicationContext))");
            c8.getRoot().setLayoutParams(layoutParams);
            c8.f10405b.setTypeface(E4.j.f2274g.u());
            TextView textView = c8.f10405b;
            Object obj = arrayList.get(i8);
            AbstractC3159y.h(obj, "languages[i]");
            String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            textView.setText(upperCase);
            AbstractC3159y.f(linearLayout);
            linearLayout.addView(c8.getRoot());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04be A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020c A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0145 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ce A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0220 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0268 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c9 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03cc A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0478 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04d2 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0550 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0561 A[Catch: all -> 0x004f, Exception -> 0x0052, TRY_LEAVE, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I3() {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.I3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(MoreInfo this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C1498h c1498h = this$0.f28518Q;
        AbstractC3159y.f(c1498h);
        C1501k n8 = c1498h.n();
        AbstractC3159y.f(n8);
        this$0.Q3(n8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(MoreInfo this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!this$0.isFinishing()) {
            C3323k c3323k = new C3323k();
            C1498h c1498h = this$0.f28518Q;
            AbstractC3159y.f(c1498h);
            String j12 = c1498h.j1();
            AbstractC3159y.f(j12);
            C3323k.r(c3323k, this$0, j12, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(final MoreInfo this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.z3().f10284y.getVisibility() == 0) {
            this$0.z3().f10284y.setVisibility(8);
            this$0.z3().f10266p.setImageResource(R.drawable.vector_add);
        } else {
            this$0.z3().f10284y.setVisibility(0);
            this$0.z3().f10266p.setImageResource(R.drawable.vector_remove);
            this$0.z3().f10227R.post(new Runnable() { // from class: A4.s1
                @Override // java.lang.Runnable
                public final void run() {
                    MoreInfo.M3(MoreInfo.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(MoreInfo this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.z3().f10227R.smoothScrollTo(0, this$0.z3().f10222M.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(MoreInfo this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!this$0.isFinishing()) {
            C3323k c3323k = new C3323k();
            String string = this$0.getString(R.string.url_iap);
            AbstractC3159y.h(string, "getString(R.string.url_iap)");
            C3323k.r(c3323k, this$0, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3(ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        AbstractC3159y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            String b8 = ((X4.B) arrayList.get(i8)).b();
            if (b8 != null && b8.length() != 0) {
                final C1362b0 c8 = C1362b0.c(LayoutInflater.from(getApplicationContext()));
                AbstractC3159y.h(c8, "inflate(LayoutInflater.from(applicationContext))");
                c8.getRoot().setLayoutParams(layoutParams);
                c8.f10405b.setTypeface(E4.j.f2274g.u());
                c8.f10405b.setText(((X4.B) arrayList.get(i8)).b());
                c8.f10405b.setOnClickListener(new View.OnClickListener() { // from class: A4.n1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoreInfo.P3(C1362b0.this, view);
                    }
                });
                AbstractC3159y.f(linearLayout);
                linearLayout.addView(c8.getRoot());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(C1362b0 scanItemBinding, View view) {
        AbstractC3159y.i(scanItemBinding, "$scanItemBinding");
        if (scanItemBinding.f10405b.getMaxLines() == 1) {
            scanItemBinding.f10405b.setMaxLines(Integer.MAX_VALUE);
        } else {
            scanItemBinding.f10405b.setMaxLines(1);
        }
    }

    private final void Q3(C1501k c1501k) {
        V0 a8 = V0.f11523i.a(c1501k);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out).add(android.R.id.content, a8, (String) null).addToBackStack(String.valueOf(c1501k.c())).commit();
        this.f28517P = a8;
    }

    private final void w3(TextView textView, View view) {
        view.setVisibility(8);
        int maxLines = textView.getMaxLines();
        int i8 = this.f28522U;
        if (maxLines == i8) {
            textView.setMaxLines(Integer.MAX_VALUE);
        } else {
            textView.setMaxLines(i8);
        }
        view.setVisibility(0);
    }

    private final String x3(String str) {
        String str2 = "";
        while (str.length() > 3) {
            Y y8 = Y.f33766a;
            String substring = str.substring(str.length() - 3);
            AbstractC3159y.h(substring, "substring(...)");
            str2 = String.format(",%s%s", Arrays.copyOf(new Object[]{substring, str2}, 2));
            AbstractC3159y.h(str2, "format(...)");
            str = str.substring(0, str.length() - 3);
            AbstractC3159y.h(str, "substring(...)");
        }
        if (str.length() > 0) {
            return str + str2;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y3(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N z3() {
        return (N) this.f28516O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        try {
            setContentView(z3().getRoot());
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C1498h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f28518Q = (C1498h) parcelable;
            }
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                z3().f10228S.setNavigationIcon(drawable);
                z3().f10228S.setNavigationContentDescription(getString(R.string.back));
            }
            z3().f10228S.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.l1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreInfo.F3(MoreInfo.this, view);
                }
            });
            N z32 = z3();
            TextView textView = z32.f10267p0;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.u());
            z32.f10233X.setTypeface(aVar.t());
            z32.f10241c0.setTypeface(aVar.u());
            z32.f10269q0.setTypeface(aVar.u());
            z32.f10286z.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.m1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreInfo.G3(view);
                }
            });
            if (this.f28518Q != null) {
                I3();
                C1498h c1498h = this.f28518Q;
                AbstractC3159y.f(c1498h);
                if (!c1498h.r1()) {
                    AbstractC2829k.d(this.f28515N, null, null, new k(null), 3, null);
                    AbstractC2829k.d(this.f28515N, null, null, new l(null), 3, null);
                    AbstractC2829k.d(this.f28515N, null, null, new m(null), 3, null);
                } else {
                    z3().f10203A.setVisibility(8);
                    z3().f10222M.setVisibility(8);
                    z3().f10218I.setVisibility(8);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
