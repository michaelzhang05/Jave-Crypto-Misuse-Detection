package I4;

import L5.I;
import L5.t;
import N4.q;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.documentfile.provider.DocumentFile;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.M;
import i6.N;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0064a f4095e = new C0064a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f4096a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.b f4097b;

    /* renamed from: c, reason: collision with root package name */
    private String f4098c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4099d;

    /* renamed from: I4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0064a {
        private C0064a() {
        }

        public /* synthetic */ C0064a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4100a;

        /* renamed from: c, reason: collision with root package name */
        int f4102c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4100a = obj;
            this.f4102c |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4103a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K4.b f4105c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(K4.b bVar, P5.d dVar) {
            super(2, dVar);
            this.f4105c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f4105c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4103a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.c(this.f4105c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4106a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K4.b f4108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K4.b bVar, P5.d dVar) {
            super(2, dVar);
            this.f4108c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f4108c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4106a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.c(this.f4108c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4109a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K4.b f4111c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K4.b bVar, P5.d dVar) {
            super(2, dVar);
            this.f4111c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f4111c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4109a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.b(this.f4111c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f4112a;

        /* renamed from: b, reason: collision with root package name */
        Object f4113b;

        /* renamed from: c, reason: collision with root package name */
        int f4114c;

        /* renamed from: d, reason: collision with root package name */
        int f4115d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f4116e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f4117f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I4.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0065a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f4118a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f4119b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K4.b f4120c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f4121d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0065a(a aVar, K4.b bVar, int i8, P5.d dVar) {
                super(2, dVar);
                this.f4119b = aVar;
                this.f4120c = bVar;
                this.f4121d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0065a(this.f4119b, this.f4120c, this.f4121d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0065a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4118a == 0) {
                    t.b(obj);
                    J4.b bVar = this.f4119b.f4097b;
                    if (bVar != null) {
                        bVar.a(this.f4120c, this.f4121d);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f4122a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f4123b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f4124c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f4123b = aVar;
                this.f4124c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f4123b, this.f4124c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4122a == 0) {
                    t.b(obj);
                    J4.b bVar = this.f4123b.f4097b;
                    if (bVar != null) {
                        bVar.d(this.f4124c);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList arrayList, a aVar, P5.d dVar) {
            super(2, dVar);
            this.f4116e = arrayList;
            this.f4117f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f4116e, this.f4117f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r11.f4115d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L39
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                L5.t.b(r12)
                goto La7
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                int r1 = r11.f4114c
                java.lang.Object r6 = r11.f4112a
                java.util.Iterator r6 = (java.util.Iterator) r6
                L5.t.b(r12)
                r12 = r6
                goto L4b
            L2a:
                int r1 = r11.f4114c
                java.lang.Object r6 = r11.f4113b
                K4.b r6 = (K4.b) r6
                java.lang.Object r7 = r11.f4112a
                java.util.Iterator r7 = (java.util.Iterator) r7
                L5.t.b(r12)
                r12 = r7
                goto L75
            L39:
                L5.t.b(r12)
                java.util.ArrayList r12 = r11.f4116e
                int r12 = r12.size()
                if (r12 <= 0) goto La7
                java.util.ArrayList r12 = r11.f4116e
                java.util.Iterator r12 = r12.iterator()
                r1 = 0
            L4b:
                boolean r6 = r12.hasNext()
                if (r6 == 0) goto L8f
                int r6 = r1 + 1
                java.lang.Object r7 = r12.next()
                K4.b r7 = (K4.b) r7
                i6.J0 r8 = i6.C2812b0.c()
                I4.a$f$a r9 = new I4.a$f$a
                I4.a r10 = r11.f4117f
                r9.<init>(r10, r7, r1, r5)
                r11.f4112a = r12
                r11.f4113b = r7
                r11.f4114c = r6
                r11.f4115d = r4
                java.lang.Object r1 = i6.AbstractC2825i.g(r8, r9, r11)
                if (r1 != r0) goto L73
                return r0
            L73:
                r1 = r6
                r6 = r7
            L75:
                I4.a r7 = r11.f4117f
                java.lang.String r7 = I4.a.g(r7, r6)
                r6.d(r7)
                I4.a r7 = r11.f4117f
                r11.f4112a = r12
                r11.f4113b = r5
                r11.f4114c = r1
                r11.f4115d = r3
                java.lang.Object r6 = I4.a.d(r7, r6, r11)
                if (r6 != r0) goto L4b
                return r0
            L8f:
                i6.J0 r12 = i6.C2812b0.c()
                I4.a$f$b r1 = new I4.a$f$b
                I4.a r3 = r11.f4117f
                java.util.ArrayList r4 = r11.f4116e
                r1.<init>(r3, r4, r5)
                r11.f4112a = r5
                r11.f4115d = r2
                java.lang.Object r12 = i6.AbstractC2825i.g(r12, r1, r11)
                if (r12 != r0) goto La7
                return r0
            La7:
                L5.I r12 = L5.I.f6487a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: I4.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4125a;

        /* renamed from: b, reason: collision with root package name */
        Object f4126b;

        /* renamed from: c, reason: collision with root package name */
        Object f4127c;

        /* renamed from: d, reason: collision with root package name */
        Object f4128d;

        /* renamed from: e, reason: collision with root package name */
        Object f4129e;

        /* renamed from: f, reason: collision with root package name */
        int f4130f;

        /* renamed from: g, reason: collision with root package name */
        int f4131g;

        /* renamed from: h, reason: collision with root package name */
        long f4132h;

        /* renamed from: i, reason: collision with root package name */
        long f4133i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4134j;

        /* renamed from: l, reason: collision with root package name */
        int f4136l;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4134j = obj;
            this.f4136l |= Integer.MIN_VALUE;
            return a.this.n(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4137a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4139c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, P5.d dVar) {
            super(2, dVar);
            this.f4139c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f4139c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4137a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.f(this.f4139c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4140a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K4.b f4142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(K4.b bVar, P5.d dVar) {
            super(2, dVar);
            this.f4142c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f4142c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4140a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.c(this.f4142c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4143a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K4.b f4145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(K4.b bVar, P5.d dVar) {
            super(2, dVar);
            this.f4145c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f4145c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4143a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.g(this.f4145c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4146a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f4148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f4148c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f4148c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: I4.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4149a;

        /* renamed from: b, reason: collision with root package name */
        Object f4150b;

        /* renamed from: c, reason: collision with root package name */
        Object f4151c;

        /* renamed from: d, reason: collision with root package name */
        Object f4152d;

        /* renamed from: e, reason: collision with root package name */
        Object f4153e;

        /* renamed from: f, reason: collision with root package name */
        Object f4154f;

        /* renamed from: g, reason: collision with root package name */
        long f4155g;

        /* renamed from: h, reason: collision with root package name */
        long f4156h;

        /* renamed from: i, reason: collision with root package name */
        int f4157i;

        /* renamed from: j, reason: collision with root package name */
        int f4158j;

        /* renamed from: k, reason: collision with root package name */
        int f4159k;

        /* renamed from: l, reason: collision with root package name */
        int f4160l;

        /* renamed from: m, reason: collision with root package name */
        int f4161m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f4162n;

        /* renamed from: p, reason: collision with root package name */
        int f4164p;

        l(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4162n = obj;
            this.f4164p |= Integer.MIN_VALUE;
            return a.this.u(null, null, null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4165a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, P5.d dVar) {
            super(2, dVar);
            this.f4167c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(this.f4167c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4165a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.e(this.f4167c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4168a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4170c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, P5.d dVar) {
            super(2, dVar);
            this.f4170c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new n(this.f4170c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4168a == 0) {
                t.b(obj);
                J4.b bVar = a.this.f4097b;
                if (bVar != null) {
                    bVar.f(this.f4170c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(Context context, J4.b bVar) {
        AbstractC3159y.i(context, "context");
        this.f4096a = context;
        this.f4097b = bVar;
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
    public final java.lang.Object l(K4.b r20, P5.d r21) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.a.l(K4.b, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(ArrayList arrayList, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(arrayList, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
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
    public final java.lang.Object n(java.lang.Object r23, java.lang.Object r24, P5.d r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.a.n(java.lang.Object, java.lang.Object, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(K4.b r23, P5.d r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.a.o(K4.b, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(K4.b bVar) {
        String m8;
        G4.a aVar = new G4.a(this.f4096a);
        if (aVar.i()) {
            m8 = new N4.e().m(bVar.b());
        } else {
            m8 = new N4.e().m(bVar.c());
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
            ContentResolver contentResolver = this.f4096a.getContentResolver();
            if (contentResolver != null) {
                inputStream = contentResolver.openInputStream(((DocumentFile) obj).getUri());
            } else {
                inputStream = null;
            }
            AbstractC3159y.f(inputStream);
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
                ContentResolver contentResolver = this.f4096a.getContentResolver();
                if (contentResolver != null) {
                    outputStream = contentResolver.openOutputStream(documentFile.getUri());
                } else {
                    outputStream = null;
                }
                AbstractC3159y.f(outputStream);
                return outputStream;
            }
            throw new Exception("getOutputStream: DocumentFile name is null");
        }
        throw new Exception("getOutputStream: Illegal parameter type");
    }

    private final long s(K4.b bVar) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = this.f4096a.getPackageManager();
            AbstractC3159y.h(packageManager, "context.packageManager");
            packageInfo = q.d(packageManager, bVar.c(), 0);
        } catch (Exception e8) {
            e8.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            return new N4.f().m(packageInfo);
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
    public final java.lang.Object u(java.util.ArrayList r27, java.util.ArrayList r28, java.lang.String r29, long r30, P5.d r32) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.a.u(java.util.ArrayList, java.util.ArrayList, java.lang.String, long, P5.d):java.lang.Object");
    }

    public final InterfaceC2855x0 t(ArrayList appsToBackup) {
        InterfaceC2855x0 d8;
        AbstractC3159y.i(appsToBackup, "appsToBackup");
        d8 = AbstractC2829k.d(N.a(C2812b0.b()), null, null, new k(appsToBackup, null), 3, null);
        return d8;
    }
}
