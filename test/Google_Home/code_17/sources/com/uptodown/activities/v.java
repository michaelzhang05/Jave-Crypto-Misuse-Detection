package com.uptodown.activities;

import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class v extends ViewModel {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30446d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30447a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30448b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30449c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30450a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30451b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f30452c;

        public b(ArrayList searchResults, boolean z8, boolean z9) {
            AbstractC3255y.i(searchResults, "searchResults");
            this.f30450a = searchResults;
            this.f30451b = z8;
            this.f30452c = z9;
        }

        public final boolean a() {
            return this.f30451b;
        }

        public final boolean b() {
            return this.f30452c;
        }

        public final ArrayList c() {
            return this.f30450a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f30450a, bVar.f30450a) && this.f30451b == bVar.f30451b && this.f30452c == bVar.f30452c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f30450a.hashCode() * 31;
            boolean z8 = this.f30451b;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            int i9 = (hashCode + i8) * 31;
            boolean z9 = this.f30452c;
            return i9 + (z9 ? 1 : z9 ? 1 : 0);
        }

        public String toString() {
            return "SearchData(searchResults=" + this.f30450a + ", firstRequest=" + this.f30451b + ", hasMoreResults=" + this.f30452c + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30453a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30455c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30456d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30457e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, int i8, S5.d dVar) {
            super(2, dVar);
            this.f30455c = context;
            this.f30456d = str;
            this.f30457e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f30455c, this.f30456d, this.f30457e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
        
            if (r9.size() < 29) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[LOOP:0: B:18:0x007b->B:19:0x007d, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                T5.b.e()
                int r0 = r8.f30453a
                if (r0 != 0) goto Lc6
                O5.t.b(r9)
                com.uptodown.activities.v r9 = com.uptodown.activities.v.this
                o6.w r9 = com.uptodown.activities.v.a(r9)
                o5.y$a r0 = o5.AbstractC3685y.a.f36548a
                r9.setValue(r0)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                o5.F r0 = new o5.F
                android.content.Context r1 = r8.f30455c
                r0.<init>(r1)
                java.lang.String r1 = r8.f30456d
                r2 = 30
                int r3 = r8.f30457e
                a5.I r0 = r0.N0(r1, r2, r3)
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto La1
                java.lang.String r1 = r0.d()
                if (r1 == 0) goto La1
                org.json.JSONObject r1 = new org.json.JSONObject
                java.lang.String r0 = r0.d()
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                r1.<init>(r0)
                java.lang.String r0 = "success"
                boolean r4 = r1.isNull(r0)
                if (r4 != 0) goto L52
                int r0 = r1.getInt(r0)
                goto L53
            L52:
                r0 = 0
            L53:
                java.lang.String r4 = "data"
                boolean r5 = r1.isNull(r4)
                if (r5 != 0) goto L71
                org.json.JSONObject r1 = r1.getJSONObject(r4)
                java.lang.String r4 = "jsonObject.getJSONObject(Constantes.FIELD_DATA)"
                kotlin.jvm.internal.AbstractC3255y.h(r1, r4)
                java.lang.String r4 = "results"
                boolean r5 = r1.isNull(r4)
                if (r5 != 0) goto L71
                org.json.JSONArray r1 = r1.getJSONArray(r4)
                goto L72
            L71:
                r1 = 0
            L72:
                if (r0 != r2) goto La1
                if (r1 == 0) goto La1
                int r0 = r1.length()
                r4 = 0
            L7b:
                if (r4 >= r0) goto La1
                org.json.JSONObject r5 = r1.getJSONObject(r4)
                a5.h$b r6 = a5.C1641h.f14163L0
                java.lang.String r7 = "jsonObjectTop"
                kotlin.jvm.internal.AbstractC3255y.h(r5, r7)
                a5.h r5 = r6.a(r5)
                r9.add(r5)
                com.squareup.picasso.s r6 = com.squareup.picasso.s.h()
                java.lang.String r5 = r5.m0()
                com.squareup.picasso.w r5 = r6.l(r5)
                r5.d()
                int r4 = r4 + 1
                goto L7b
            La1:
                int r0 = r8.f30457e
                if (r0 <= 0) goto Laf
                int r0 = r9.size()
                r1 = 29
                r2 = 0
                if (r0 >= r1) goto Laf
                goto Lb0
            Laf:
                r3 = 1
            Lb0:
                com.uptodown.activities.v r0 = com.uptodown.activities.v.this
                o6.w r0 = com.uptodown.activities.v.a(r0)
                o5.y$c r1 = new o5.y$c
                com.uptodown.activities.v$b r4 = new com.uptodown.activities.v$b
                r4.<init>(r9, r2, r3)
                r1.<init>(r4)
                r0.setValue(r1)
                O5.I r9 = O5.I.f8278a
                return r9
            Lc6:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.v.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public v() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.b.f36549a);
        this.f30447a = a8;
        this.f30448b = a8;
    }

    public final void b(Context context, String textToSearch, int i8) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(textToSearch, "textToSearch");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, textToSearch, i8, null), 2, null);
    }

    public final InterfaceC3698L c() {
        return this.f30448b;
    }

    public final boolean d() {
        return this.f30449c;
    }

    public final void e(boolean z8) {
        this.f30449c = z8;
    }
}
