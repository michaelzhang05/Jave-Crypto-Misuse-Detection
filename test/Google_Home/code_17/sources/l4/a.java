package L4;

import O5.I;
import O5.t;
import Q4.q;
import a6.InterfaceC1668n;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0107a f6090e = new C0107a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f6091a;

    /* renamed from: b, reason: collision with root package name */
    private final M4.b f6092b;

    /* renamed from: c, reason: collision with root package name */
    private String f6093c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6094d;

    /* renamed from: L4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0107a {
        private C0107a() {
        }

        public /* synthetic */ C0107a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6095a;

        /* renamed from: c, reason: collision with root package name */
        int f6097c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6095a = obj;
            this.f6097c |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6098a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N4.b f6100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N4.b bVar, S5.d dVar) {
            super(2, dVar);
            this.f6100c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f6100c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6098a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.a(this.f6100c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6101a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N4.b f6103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(N4.b bVar, S5.d dVar) {
            super(2, dVar);
            this.f6103c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f6103c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6101a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.a(this.f6103c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6104a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N4.b f6106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(N4.b bVar, S5.d dVar) {
            super(2, dVar);
            this.f6106c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f6106c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6104a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.b(this.f6106c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f6107a;

        /* renamed from: b, reason: collision with root package name */
        Object f6108b;

        /* renamed from: c, reason: collision with root package name */
        int f6109c;

        /* renamed from: d, reason: collision with root package name */
        int f6110d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f6111e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f6112f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L4.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0108a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6113a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f6114b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N4.b f6115c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6116d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0108a(a aVar, N4.b bVar, int i8, S5.d dVar) {
                super(2, dVar);
                this.f6114b = aVar;
                this.f6115c = bVar;
                this.f6116d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0108a(this.f6114b, this.f6115c, this.f6116d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6113a == 0) {
                    t.b(obj);
                    M4.b bVar = this.f6114b.f6092b;
                    if (bVar != null) {
                        bVar.g(this.f6115c, this.f6116d);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0108a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6117a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f6118b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f6119c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, ArrayList arrayList, S5.d dVar) {
                super(2, dVar);
                this.f6118b = aVar;
                this.f6119c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f6118b, this.f6119c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6117a == 0) {
                    t.b(obj);
                    M4.b bVar = this.f6118b.f6092b;
                    if (bVar != null) {
                        bVar.c(this.f6119c);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList arrayList, a aVar, S5.d dVar) {
            super(2, dVar);
            this.f6111e = arrayList;
            this.f6112f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f6111e, this.f6112f, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:13:0x004b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r11.f6110d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L39
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                O5.t.b(r12)
                goto La7
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                int r1 = r11.f6109c
                java.lang.Object r6 = r11.f6107a
                java.util.Iterator r6 = (java.util.Iterator) r6
                O5.t.b(r12)
                r12 = r6
                goto L4b
            L2a:
                int r1 = r11.f6109c
                java.lang.Object r6 = r11.f6108b
                N4.b r6 = (N4.b) r6
                java.lang.Object r7 = r11.f6107a
                java.util.Iterator r7 = (java.util.Iterator) r7
                O5.t.b(r12)
                r12 = r7
                goto L75
            L39:
                O5.t.b(r12)
                java.util.ArrayList r12 = r11.f6111e
                int r12 = r12.size()
                if (r12 <= 0) goto La7
                java.util.ArrayList r12 = r11.f6111e
                java.util.Iterator r12 = r12.iterator()
                r1 = 0
            L4b:
                boolean r6 = r12.hasNext()
                if (r6 == 0) goto L8f
                int r6 = r1 + 1
                java.lang.Object r7 = r12.next()
                N4.b r7 = (N4.b) r7
                l6.J0 r8 = l6.C3347b0.c()
                L4.a$f$a r9 = new L4.a$f$a
                L4.a r10 = r11.f6112f
                r9.<init>(r10, r7, r1, r5)
                r11.f6107a = r12
                r11.f6108b = r7
                r11.f6109c = r6
                r11.f6110d = r4
                java.lang.Object r1 = l6.AbstractC3360i.g(r8, r9, r11)
                if (r1 != r0) goto L73
                return r0
            L73:
                r1 = r6
                r6 = r7
            L75:
                L4.a r7 = r11.f6112f
                java.lang.String r7 = L4.a.g(r7, r6)
                r6.d(r7)
                L4.a r7 = r11.f6112f
                r11.f6107a = r12
                r11.f6108b = r5
                r11.f6109c = r1
                r11.f6110d = r3
                java.lang.Object r6 = L4.a.d(r7, r6, r11)
                if (r6 != r0) goto L4b
                return r0
            L8f:
                l6.J0 r12 = l6.C3347b0.c()
                L4.a$f$b r1 = new L4.a$f$b
                L4.a r3 = r11.f6112f
                java.util.ArrayList r4 = r11.f6111e
                r1.<init>(r3, r4, r5)
                r11.f6107a = r5
                r11.f6110d = r2
                java.lang.Object r12 = l6.AbstractC3360i.g(r12, r1, r11)
                if (r12 != r0) goto La7
                return r0
            La7:
                O5.I r12 = O5.I.f8278a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: L4.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6120a;

        /* renamed from: b, reason: collision with root package name */
        Object f6121b;

        /* renamed from: c, reason: collision with root package name */
        Object f6122c;

        /* renamed from: d, reason: collision with root package name */
        Object f6123d;

        /* renamed from: e, reason: collision with root package name */
        Object f6124e;

        /* renamed from: f, reason: collision with root package name */
        int f6125f;

        /* renamed from: g, reason: collision with root package name */
        int f6126g;

        /* renamed from: h, reason: collision with root package name */
        long f6127h;

        /* renamed from: i, reason: collision with root package name */
        long f6128i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f6129j;

        /* renamed from: l, reason: collision with root package name */
        int f6131l;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6129j = obj;
            this.f6131l |= Integer.MIN_VALUE;
            return a.this.n(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6132a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6134c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, S5.d dVar) {
            super(2, dVar);
            this.f6134c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f6134c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6132a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.e(this.f6134c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6135a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N4.b f6137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(N4.b bVar, S5.d dVar) {
            super(2, dVar);
            this.f6137c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f6137c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6135a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.a(this.f6137c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6138a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N4.b f6140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(N4.b bVar, S5.d dVar) {
            super(2, dVar);
            this.f6140c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(this.f6140c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6138a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.f(this.f6140c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6141a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f6143c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f6143c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f6143c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            if (r0.exists() != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            r0.delete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            if (r4.exists() != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        
            r4.delete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
        
            if (r0.exists() != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
        
            if (r4.exists() != false) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: L4.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6144a;

        /* renamed from: b, reason: collision with root package name */
        Object f6145b;

        /* renamed from: c, reason: collision with root package name */
        Object f6146c;

        /* renamed from: d, reason: collision with root package name */
        Object f6147d;

        /* renamed from: e, reason: collision with root package name */
        Object f6148e;

        /* renamed from: f, reason: collision with root package name */
        Object f6149f;

        /* renamed from: g, reason: collision with root package name */
        long f6150g;

        /* renamed from: h, reason: collision with root package name */
        long f6151h;

        /* renamed from: i, reason: collision with root package name */
        int f6152i;

        /* renamed from: j, reason: collision with root package name */
        int f6153j;

        /* renamed from: k, reason: collision with root package name */
        int f6154k;

        /* renamed from: l, reason: collision with root package name */
        int f6155l;

        /* renamed from: m, reason: collision with root package name */
        int f6156m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f6157n;

        /* renamed from: p, reason: collision with root package name */
        int f6159p;

        l(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6157n = obj;
            this.f6159p |= Integer.MIN_VALUE;
            return a.this.u(null, null, null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6160a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6162c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, S5.d dVar) {
            super(2, dVar);
            this.f6162c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(this.f6162c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6160a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.d(this.f6162c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6163a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6165c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, S5.d dVar) {
            super(2, dVar);
            this.f6165c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new n(this.f6165c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6163a == 0) {
                t.b(obj);
                M4.b bVar = a.this.f6092b;
                if (bVar != null) {
                    bVar.e(this.f6165c);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public a(Context context, M4.b bVar) {
        AbstractC3255y.i(context, "context");
        this.f6091a = context;
        this.f6092b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:17)(2:14|15))(3:20|21|(2:23|(2:25|(4:27|(1:29)|30|(2:32|(1:34)))(2:35|(1:37)))(2:38|(4:40|41|(1:43)(2:59|(1:63))|(4:45|(1:47)|48|(2:50|(1:52))(2:53|(1:55)))(2:56|(1:58))))))|18|19))|66|6|7|(0)(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(N4.b r20, S5.d r21) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.a.l(N4.b, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(ArrayList arrayList, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new f(arrayList, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0103, code lost:
    
        r6 = r23;
        r3 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0100 -> B:10:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r23, java.lang.Object r24, S5.d r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.a.n(java.lang.Object, java.lang.Object, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(N4.b r23, S5.d r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.a.o(N4.b, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(N4.b bVar) {
        String m8;
        J4.a aVar = new J4.a(this.f6091a);
        if (aVar.i()) {
            m8 = new Q4.e().m(bVar.b());
        } else {
            m8 = new Q4.e().m(bVar.c());
        }
        if (aVar.k()) {
            return m8 + '_' + s(bVar);
        }
        return m8;
    }

    private final InputStream q(Object obj) {
        InputStream inputStream;
        if (obj instanceof File) {
            return new FileInputStream((File) obj);
        }
        if (obj instanceof DocumentFile) {
            ContentResolver contentResolver = this.f6091a.getContentResolver();
            if (contentResolver != null) {
                inputStream = contentResolver.openInputStream(((DocumentFile) obj).getUri());
            } else {
                inputStream = null;
            }
            AbstractC3255y.f(inputStream);
            return inputStream;
        }
        throw new Exception("getInputStream: Illegal parameter type");
    }

    private final OutputStream r(Object obj) {
        OutputStream outputStream;
        if (obj instanceof File) {
            return new FileOutputStream((File) obj);
        }
        if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.getName() != null) {
                ContentResolver contentResolver = this.f6091a.getContentResolver();
                if (contentResolver != null) {
                    outputStream = contentResolver.openOutputStream(documentFile.getUri());
                } else {
                    outputStream = null;
                }
                AbstractC3255y.f(outputStream);
                return outputStream;
            }
            throw new Exception("getOutputStream: DocumentFile name is null");
        }
        throw new Exception("getOutputStream: Illegal parameter type");
    }

    private final long s(N4.b bVar) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = this.f6091a.getPackageManager();
            AbstractC3255y.h(packageManager, "context.packageManager");
            packageInfo = q.d(packageManager, bVar.c(), 0);
        } catch (Exception e8) {
            e8.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            return new Q4.f().m(packageInfo);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(2:20|(4:29|15|16|(2:32|(3:34|16|(0)(0))(3:35|36|37))(0))(1:23))(1:31)|24|(1:26)(5:28|14|15|16|(0)(0)))(0))(2:38|39))(2:40|41))(4:43|(3:48|(1:50)(2:58|(2:60|(1:62)(2:63|64))(1:65))|(2:52|(1:54)(1:55))(2:56|57))|36|37)|42|(0)(0)))|68|6|7|(0)(0)|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0229, code lost:
    
        r11 = r1;
        r12 = r3;
        r2 = r17;
        r4 = r18;
        r1 = r21;
        r5 = 0;
        r17 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0072, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x026f, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0197 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023d A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0263 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0214 -> B:14:0x021c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0157 -> B:16:0x0194). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.util.ArrayList r27, java.util.ArrayList r28, java.lang.String r29, long r30, S5.d r32) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.a.u(java.util.ArrayList, java.util.ArrayList, java.lang.String, long, S5.d):java.lang.Object");
    }

    public final InterfaceC3390x0 t(ArrayList appsToBackup) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(appsToBackup, "appsToBackup");
        d8 = AbstractC3364k.d(N.a(C3347b0.b()), null, null, new k(appsToBackup, null), 3, null);
        return d8;
    }
}
