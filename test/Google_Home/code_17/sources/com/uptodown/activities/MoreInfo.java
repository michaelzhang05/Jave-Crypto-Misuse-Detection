package com.uptodown.activities;

import H4.j;
import O5.InterfaceC1355k;
import W4.C1471b0;
import W4.N;
import X4.V0;
import a5.C1630B;
import a5.C1641h;
import a5.C1644k;
import a5.C1648o;
import a6.InterfaceC1668n;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import o5.C3671k;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class MoreInfo extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    private V0 f29571P;

    /* renamed from: Q, reason: collision with root package name */
    private C1641h f29572Q;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList f29573R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f29574S;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f29575T;

    /* renamed from: N, reason: collision with root package name */
    private final LifecycleCoroutineScope f29569N = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29570O = O5.l.b(new b());

    /* renamed from: U, reason: collision with root package name */
    private final int f29576U = 2;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C1648o f29577a;

        public a(C1648o c1648o) {
            this.f29577a = c1648o;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (MoreInfo.this.f29571P != null) {
                V0 v02 = MoreInfo.this.f29571P;
                AbstractC3255y.f(v02);
                C1648o c1648o = this.f29577a;
                if (c1648o != null) {
                    str = c1648o.Y();
                } else {
                    str = null;
                }
                v02.I(str);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
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
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29580a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29582a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MoreInfo f29583b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MoreInfo moreInfo, S5.d dVar) {
                super(2, dVar);
                this.f29583b = moreInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29583b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29582a == 0) {
                    O5.t.b(obj);
                    ArrayList arrayList = this.f29583b.f29573R;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        this.f29583b.z3().f11860A.setVisibility(0);
                        TextView textView = this.f29583b.z3().f11886T;
                        j.a aVar = H4.j.f3824g;
                        textView.setTypeface(aVar.t());
                        this.f29583b.z3().f11887U.setTypeface(aVar.u());
                        ArrayList arrayList2 = this.f29583b.f29573R;
                        AbstractC3255y.f(arrayList2);
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
                        this.f29583b.z3().f11887U.setText(str);
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            Object e8 = T5.b.e();
            int i9 = this.f29580a;
            if (i9 != 0) {
                if (i9 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                Context applicationContext = MoreInfo.this.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                C3660F c3660f = new C3660F(applicationContext);
                C1641h c1641h = MoreInfo.this.f29572Q;
                AbstractC3255y.f(c1641h);
                a5.I l8 = c3660f.l(c1641h.i());
                if (!l8.b() && l8.d() != null) {
                    String d8 = l8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = l8.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA) && (jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                            MoreInfo.this.f29573R = new ArrayList();
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                ArrayList arrayList = MoreInfo.this.f29573R;
                                AbstractC3255y.f(arrayList);
                                arrayList.add(jSONArray.get(i10).toString());
                            }
                        }
                        J0 c8 = C3347b0.c();
                        a aVar = new a(MoreInfo.this, null);
                        this.f29580a = 1;
                        if (AbstractC3360i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29584a;

        /* renamed from: b, reason: collision with root package name */
        Object f29585b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29586c;

        /* renamed from: e, reason: collision with root package name */
        int f29588e;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29586c = obj;
            this.f29588e |= Integer.MIN_VALUE;
            return MoreInfo.this.A3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29589a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f29591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T t8, S5.d dVar) {
            super(2, dVar);
            this.f29591c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f29591c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            T5.b.e();
            if (this.f29589a == 0) {
                O5.t.b(obj);
                Context applicationContext = MoreInfo.this.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                C3660F c3660f = new C3660F(applicationContext);
                C1641h c1641h = MoreInfo.this.f29572Q;
                AbstractC3255y.f(c1641h);
                a5.I n8 = c3660f.n(c1641h.i());
                if (!n8.b() && n8.d() != null) {
                    String d8 = n8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = n8.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA) && (jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                            this.f29591c.f34162a = new ArrayList();
                            int length = jSONArray.length();
                            for (int i9 = 0; i9 < length; i9++) {
                                Object obj2 = this.f29591c.f34162a;
                                AbstractC3255y.f(obj2);
                                ((ArrayList) obj2).add(jSONArray.getString(i9));
                            }
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f29593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MoreInfo f29594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t8, MoreInfo moreInfo, S5.d dVar) {
            super(2, dVar);
            this.f29593b = t8;
            this.f29594c = moreInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(final MoreInfo moreInfo, View view) {
            if (moreInfo.z3().f11935v.getVisibility() == 0) {
                moreInfo.z3().f11935v.setVisibility(8);
                moreInfo.z3().f11913k.setImageResource(R.drawable.vector_add);
            } else {
                moreInfo.z3().f11935v.setVisibility(0);
                moreInfo.z3().f11913k.setImageResource(R.drawable.vector_remove);
                moreInfo.z3().f11884R.post(new Runnable() { // from class: com.uptodown.activities.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        MoreInfo.f.o(MoreInfo.this);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(MoreInfo moreInfo) {
            moreInfo.z3().f11884R.smoothScrollTo(0, moreInfo.z3().f11875I.getTop());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f29593b, this.f29594c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29592a == 0) {
                O5.t.b(obj);
                Collection collection = (Collection) this.f29593b.f34162a;
                if (collection != null && !collection.isEmpty()) {
                    this.f29594c.z3().f11875I.setVisibility(0);
                    TextView textView = this.f29594c.z3().f11916l0;
                    j.a aVar = H4.j.f3824g;
                    textView.setTypeface(aVar.t());
                    this.f29594c.z3().f11918m0.setTypeface(aVar.u());
                    TextView textView2 = this.f29594c.z3().f11918m0;
                    Object obj2 = this.f29593b.f34162a;
                    AbstractC3255y.f(obj2);
                    textView2.setText(String.valueOf(((ArrayList) obj2).size()));
                    RelativeLayout relativeLayout = this.f29594c.z3().f11875I;
                    final MoreInfo moreInfo = this.f29594c;
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MoreInfo.f.n(MoreInfo.this, view);
                        }
                    });
                    MoreInfo moreInfo2 = this.f29594c;
                    moreInfo2.H3((ArrayList) this.f29593b.f34162a, moreInfo2.z3().f11935v);
                } else {
                    this.f29594c.z3().f11875I.setVisibility(8);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29595a;

        /* renamed from: b, reason: collision with root package name */
        Object f29596b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29597c;

        /* renamed from: e, reason: collision with root package name */
        int f29599e;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29597c = obj;
            this.f29599e |= Integer.MIN_VALUE;
            return MoreInfo.this.B3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29600a;

        h(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29600a == 0) {
                O5.t.b(obj);
                MoreInfo.this.z3().f11943z.f11842b.setVisibility(0);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29602a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f29604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Q q8, S5.d dVar) {
            super(2, dVar);
            this.f29604c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f29604c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            T5.b.e();
            if (this.f29602a == 0) {
                O5.t.b(obj);
                try {
                    Context applicationContext = MoreInfo.this.getApplicationContext();
                    AbstractC3255y.h(applicationContext, "applicationContext");
                    C3660F c3660f = new C3660F(applicationContext);
                    C1641h c1641h = MoreInfo.this.f29572Q;
                    AbstractC3255y.f(c1641h);
                    a5.I M8 = c3660f.M(c1641h.i());
                    if (!M8.b() && M8.d() != null) {
                        String d8 = M8.d();
                        AbstractC3255y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = M8.d();
                            AbstractC3255y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                this.f29604c.f34160a = jSONObject2.getInt("success");
                            }
                            if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            } else {
                                jSONObject = null;
                            }
                            if (this.f29604c.f34160a == 1 && jSONObject != null) {
                                MoreInfo.this.f29574S = new ArrayList();
                                if (!jSONObject.isNull("permissions_concern")) {
                                    JSONArray jSONArray = jSONObject.getJSONArray("permissions_concern");
                                    int length = jSONArray.length();
                                    for (int i8 = 0; i8 < length; i8++) {
                                        C1630B c1630b = new C1630B();
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i8);
                                        AbstractC3255y.h(jSONObject3, "jsonArrayPermissions.getJSONObject(i)");
                                        c1630b.a(jSONObject3);
                                        ArrayList arrayList = MoreInfo.this.f29574S;
                                        AbstractC3255y.f(arrayList);
                                        arrayList.add(c1630b);
                                    }
                                }
                                MoreInfo.this.f29575T = new ArrayList();
                                if (!jSONObject.isNull("permissions")) {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray("permissions");
                                    int length2 = jSONArray2.length();
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        C1630B c1630b2 = new C1630B();
                                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i9);
                                        AbstractC3255y.h(jSONObject4, "jsonArrayPermissions.getJSONObject(i)");
                                        c1630b2.a(jSONObject4);
                                        ArrayList arrayList2 = MoreInfo.this.f29575T;
                                        AbstractC3255y.f(arrayList2);
                                        arrayList2.add(c1630b2);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29605a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f29606b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MoreInfo f29607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Q q8, MoreInfo moreInfo, S5.d dVar) {
            super(2, dVar);
            this.f29606b = q8;
            this.f29607c = moreInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(this.f29606b, this.f29607c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            T5.b.e();
            if (this.f29605a == 0) {
                O5.t.b(obj);
                if (this.f29606b.f34160a == 1) {
                    this.f29607c.z3().f11879M.setVisibility(0);
                    ArrayList arrayList = this.f29607c.f29574S;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        MoreInfo moreInfo = this.f29607c;
                        moreInfo.O3(moreInfo.f29574S, this.f29607c.z3().f11933u);
                        ArrayList arrayList2 = this.f29607c.f29574S;
                        AbstractC3255y.f(arrayList2);
                        i8 = arrayList2.size();
                    } else {
                        this.f29607c.z3().f11879M.setVisibility(8);
                        i8 = 0;
                    }
                    ArrayList arrayList3 = this.f29607c.f29575T;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        MoreInfo moreInfo2 = this.f29607c;
                        moreInfo2.O3(moreInfo2.f29575T, this.f29607c.z3().f11939x);
                        ArrayList arrayList4 = this.f29607c.f29575T;
                        AbstractC3255y.f(arrayList4);
                        i8 += arrayList4.size();
                    }
                    C1641h c1641h = this.f29607c.f29572Q;
                    if (c1641h != null && c1641h.A0() == 0) {
                        this.f29607c.z3().f11938w0.setText(String.valueOf(i8));
                    }
                } else {
                    this.f29607c.z3().f11879M.setVisibility(8);
                }
                this.f29607c.z3().f11943z.f11842b.setVisibility(8);
                this.f29607c.z3().f11884R.setVisibility(0);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29608a;

        k(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29608a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f29608a = 1;
                if (moreInfo.B3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29610a;

        l(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29610a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f29610a = 1;
                if (moreInfo.y3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29612a;

        m(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29612a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f29612a = 1;
                if (moreInfo.A3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
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
    public final java.lang.Object A3(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.MoreInfo.d
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.MoreInfo$d r0 = (com.uptodown.activities.MoreInfo.d) r0
            int r1 = r0.f29588e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29588e = r1
            goto L18
        L13:
            com.uptodown.activities.MoreInfo$d r0 = new com.uptodown.activities.MoreInfo$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29586c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f29588e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r8)
            goto L76
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f29585b
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r4 = r0.f29584a
            com.uptodown.activities.MoreInfo r4 = (com.uptodown.activities.MoreInfo) r4
            O5.t.b(r8)
            goto L60
        L41:
            O5.t.b(r8)
            kotlin.jvm.internal.T r2 = new kotlin.jvm.internal.T
            r2.<init>()
            l6.I r8 = l6.C3347b0.b()
            com.uptodown.activities.MoreInfo$e r6 = new com.uptodown.activities.MoreInfo$e
            r6.<init>(r2, r5)
            r0.f29584a = r7
            r0.f29585b = r2
            r0.f29588e = r4
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r6, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r4 = r7
        L60:
            l6.J0 r8 = l6.C3347b0.c()
            com.uptodown.activities.MoreInfo$f r6 = new com.uptodown.activities.MoreInfo$f
            r6.<init>(r2, r4, r5)
            r0.f29584a = r5
            r0.f29585b = r5
            r0.f29588e = r3
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r6, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.A3(S5.d):java.lang.Object");
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
    public final java.lang.Object B3(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.MoreInfo.g
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.MoreInfo$g r0 = (com.uptodown.activities.MoreInfo.g) r0
            int r1 = r0.f29599e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29599e = r1
            goto L18
        L13:
            com.uptodown.activities.MoreInfo$g r0 = new com.uptodown.activities.MoreInfo$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29597c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f29599e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            O5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f29596b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r4 = r0.f29595a
            com.uptodown.activities.MoreInfo r4 = (com.uptodown.activities.MoreInfo) r4
            O5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f29596b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r5 = r0.f29595a
            com.uptodown.activities.MoreInfo r5 = (com.uptodown.activities.MoreInfo) r5
            O5.t.b(r9)
            goto L70
        L50:
            O5.t.b(r9)
            kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
            r9.<init>()
            l6.J0 r2 = l6.C3347b0.c()
            com.uptodown.activities.MoreInfo$h r7 = new com.uptodown.activities.MoreInfo$h
            r7.<init>(r6)
            r0.f29595a = r8
            r0.f29596b = r9
            r0.f29599e = r5
            java.lang.Object r2 = l6.AbstractC3360i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            l6.I r9 = l6.C3347b0.b()
            com.uptodown.activities.MoreInfo$i r7 = new com.uptodown.activities.MoreInfo$i
            r7.<init>(r2, r6)
            r0.f29595a = r5
            r0.f29596b = r2
            r0.f29599e = r4
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            l6.J0 r9 = l6.C3347b0.c()
            com.uptodown.activities.MoreInfo$j r5 = new com.uptodown.activities.MoreInfo$j
            r5.<init>(r2, r4, r6)
            r0.f29595a = r6
            r0.f29596b = r6
            r0.f29599e = r3
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            O5.I r9 = O5.I.f8278a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.B3(S5.d):java.lang.Object");
    }

    private final void C3(final TextView textView, final View view) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: D4.u1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MoreInfo.D3(textView, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(final TextView tv, final MoreInfo this$0, final View view) {
        AbstractC3255y.i(tv, "$tv");
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(view, "$view");
        if (q5.v.a(tv)) {
            tv.setOnClickListener(new View.OnClickListener() { // from class: D4.v1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MoreInfo.E3(MoreInfo.this, tv, view, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(MoreInfo this$0, TextView tv, View view, View view2) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(tv, "$tv");
        AbstractC3255y.i(view, "$view");
        this$0.w3(tv, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(MoreInfo this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        AbstractC3255y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1471b0 c8 = C1471b0.c(LayoutInflater.from(getApplicationContext()));
            AbstractC3255y.h(c8, "inflate(LayoutInflater.from(applicationContext))");
            c8.getRoot().setLayoutParams(layoutParams);
            c8.f12062b.setTypeface(H4.j.f3824g.u());
            TextView textView = c8.f12062b;
            Object obj = arrayList.get(i8);
            AbstractC3255y.h(obj, "languages[i]");
            String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            textView.setText(upperCase);
            AbstractC3255y.f(linearLayout);
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
        AbstractC3255y.i(this$0, "this$0");
        C1641h c1641h = this$0.f29572Q;
        AbstractC3255y.f(c1641h);
        C1644k s8 = c1641h.s();
        AbstractC3255y.f(s8);
        this$0.Q3(s8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(MoreInfo this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (!this$0.isFinishing()) {
            C3671k c3671k = new C3671k();
            C1641h c1641h = this$0.f29572Q;
            AbstractC3255y.f(c1641h);
            String j12 = c1641h.j1();
            AbstractC3255y.f(j12);
            C3671k.r(c3671k, this$0, j12, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(final MoreInfo this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.z3().f11941y.getVisibility() == 0) {
            this$0.z3().f11941y.setVisibility(8);
            this$0.z3().f11923p.setImageResource(R.drawable.vector_add);
        } else {
            this$0.z3().f11941y.setVisibility(0);
            this$0.z3().f11923p.setImageResource(R.drawable.vector_remove);
            this$0.z3().f11884R.post(new Runnable() { // from class: D4.t1
                @Override // java.lang.Runnable
                public final void run() {
                    MoreInfo.M3(MoreInfo.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(MoreInfo this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.z3().f11884R.smoothScrollTo(0, this$0.z3().f11879M.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(MoreInfo this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (!this$0.isFinishing()) {
            C3671k c3671k = new C3671k();
            String string = this$0.getString(R.string.url_iap);
            AbstractC3255y.h(string, "getString(R.string.url_iap)");
            C3671k.r(c3671k, this$0, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3(ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        AbstractC3255y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            String b8 = ((C1630B) arrayList.get(i8)).b();
            if (b8 != null && b8.length() != 0) {
                final C1471b0 c8 = C1471b0.c(LayoutInflater.from(getApplicationContext()));
                AbstractC3255y.h(c8, "inflate(LayoutInflater.from(applicationContext))");
                c8.getRoot().setLayoutParams(layoutParams);
                c8.f12062b.setTypeface(H4.j.f3824g.u());
                c8.f12062b.setText(((C1630B) arrayList.get(i8)).b());
                c8.f12062b.setOnClickListener(new View.OnClickListener() { // from class: D4.o1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoreInfo.P3(C1471b0.this, view);
                    }
                });
                AbstractC3255y.f(linearLayout);
                linearLayout.addView(c8.getRoot());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(C1471b0 scanItemBinding, View view) {
        AbstractC3255y.i(scanItemBinding, "$scanItemBinding");
        if (scanItemBinding.f12062b.getMaxLines() == 1) {
            scanItemBinding.f12062b.setMaxLines(Integer.MAX_VALUE);
        } else {
            scanItemBinding.f12062b.setMaxLines(1);
        }
    }

    private final void Q3(C1644k c1644k) {
        V0 a8 = V0.f13193i.a(c1644k);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out).add(android.R.id.content, a8, (String) null).addToBackStack(String.valueOf(c1644k.b())).commit();
        this.f29571P = a8;
    }

    private final void w3(TextView textView, View view) {
        view.setVisibility(8);
        int maxLines = textView.getMaxLines();
        int i8 = this.f29576U;
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
            Y y8 = Y.f34167a;
            String substring = str.substring(str.length() - 3);
            AbstractC3255y.h(substring, "substring(...)");
            str2 = String.format(",%s%s", Arrays.copyOf(new Object[]{substring, str2}, 2));
            AbstractC3255y.h(str2, "format(...)");
            str = str.substring(0, str.length() - 3);
            AbstractC3255y.h(str, "substring(...)");
        }
        if (str.length() > 0) {
            return str + str2;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y3(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N z3() {
        return (N) this.f29570O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
                    parcelable2 = extras.getParcelable("appInfo", C1641h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f29572Q = (C1641h) parcelable;
            }
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                z3().f11885S.setNavigationIcon(drawable);
                z3().f11885S.setNavigationContentDescription(getString(R.string.back));
            }
            z3().f11885S.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.m1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreInfo.F3(MoreInfo.this, view);
                }
            });
            N z32 = z3();
            TextView textView = z32.f11924p0;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            z32.f11890X.setTypeface(aVar.t());
            z32.f11898c0.setTypeface(aVar.u());
            z32.f11926q0.setTypeface(aVar.u());
            z32.f11943z.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreInfo.G3(view);
                }
            });
            if (this.f29572Q != null) {
                I3();
                C1641h c1641h = this.f29572Q;
                AbstractC3255y.f(c1641h);
                if (!c1641h.r1()) {
                    AbstractC3364k.d(this.f29569N, null, null, new k(null), 3, null);
                    AbstractC3364k.d(this.f29569N, null, null, new l(null), 3, null);
                    AbstractC3364k.d(this.f29569N, null, null, new m(null), 3, null);
                } else {
                    z3().f11860A.setVisibility(8);
                    z3().f11879M.setVisibility(8);
                    z3().f11875I.setVisibility(8);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
