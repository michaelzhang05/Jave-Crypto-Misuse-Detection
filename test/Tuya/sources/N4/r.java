package N4;

import E4.j;
import L5.I;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7237a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: N4.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0155a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7238a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f7239b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f7240c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ J4.k f7241d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0155a(String str, Context context, J4.k kVar, P5.d dVar) {
                super(2, dVar);
                this.f7239b = str;
                this.f7240c = context;
                this.f7241d = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0155a(this.f7239b, this.f7240c, this.f7241d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0155a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f7238a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    a aVar = r.f7237a;
                    String str = this.f7239b;
                    Context context = this.f7240c;
                    J4.k kVar = this.f7241d;
                    this.f7238a = 1;
                    if (aVar.c(str, context, kVar, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            Object f7242a;

            /* renamed from: b, reason: collision with root package name */
            Object f7243b;

            /* renamed from: c, reason: collision with root package name */
            int f7244c;

            /* renamed from: d, reason: collision with root package name */
            int f7245d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f7246e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f7247f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ J4.k f7248g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: N4.r$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0156a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f7249a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J4.k f7250b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f7251c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f7252d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0156a(J4.k kVar, String str, String str2, P5.d dVar) {
                    super(2, dVar);
                    this.f7250b = kVar;
                    this.f7251c = str;
                    this.f7252d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0156a(this.f7250b, this.f7251c, this.f7252d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0156a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f7249a == 0) {
                        L5.t.b(obj);
                        J4.k kVar = this.f7250b;
                        if (kVar != null) {
                            kVar.e(this.f7251c);
                        }
                        j.a aVar = E4.j.f2274g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f7252d);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(304, bundle);
                            }
                        }
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: N4.r$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0157b extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f7253a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J4.k f7254b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f7255c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f7256d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0157b(J4.k kVar, String str, String str2, P5.d dVar) {
                    super(2, dVar);
                    this.f7254b = kVar;
                    this.f7255c = str;
                    this.f7256d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0157b(this.f7254b, this.f7255c, this.f7256d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0157b) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f7253a == 0) {
                        L5.t.b(obj);
                        J4.k kVar = this.f7254b;
                        if (kVar != null) {
                            kVar.a(this.f7255c);
                        }
                        j.a aVar = E4.j.f2274g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f7256d);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(301, bundle);
                            }
                        }
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f7257a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J4.k f7258b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f7259c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f7260d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f7261e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(J4.k kVar, String str, String str2, String str3, P5.d dVar) {
                    super(2, dVar);
                    this.f7258b = kVar;
                    this.f7259c = str;
                    this.f7260d = str2;
                    this.f7261e = str3;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new c(this.f7258b, this.f7259c, this.f7260d, this.f7261e, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f7257a == 0) {
                        L5.t.b(obj);
                        J4.k kVar = this.f7258b;
                        if (kVar != null) {
                            kVar.c(this.f7259c, this.f7260d);
                        }
                        j.a aVar = E4.j.f2274g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f7261e);
                            bundle.putString("filename", this.f7259c);
                            bundle.putString("errorMsg", this.f7260d);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(303, bundle);
                            }
                        }
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f7262a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J4.k f7263b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f7264c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f7265d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(J4.k kVar, String str, String str2, P5.d dVar) {
                    super(2, dVar);
                    this.f7263b = kVar;
                    this.f7264c = str;
                    this.f7265d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new d(this.f7263b, this.f7264c, this.f7265d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f7262a == 0) {
                        L5.t.b(obj);
                        J4.k kVar = this.f7263b;
                        if (kVar != null) {
                            kVar.b(this.f7264c);
                        }
                        j.a aVar = E4.j.f2274g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f7265d);
                            bundle.putString("filename", this.f7264c);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(302, bundle);
                            }
                        }
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f7266a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J4.k f7267b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f7268c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(J4.k kVar, String str, P5.d dVar) {
                    super(2, dVar);
                    this.f7267b = kVar;
                    this.f7268c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new e(this.f7267b, this.f7268c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f7266a == 0) {
                        L5.t.b(obj);
                        J4.k kVar = this.f7267b;
                        if (kVar != null) {
                            kVar.d(this.f7268c);
                            return I.f6487a;
                        }
                        return null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Context context, J4.k kVar, P5.d dVar) {
                super(2, dVar);
                this.f7246e = str;
                this.f7247f = context;
                this.f7248g = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7246e, this.f7247f, this.f7248g, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x012d A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x018c A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x01a7 A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Type inference failed for: r11v6, types: [N4.f] */
            /* JADX WARN: Type inference failed for: r12v0, types: [N4.f] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, android.content.pm.PackageInfo] */
            /* JADX WARN: Type inference failed for: r2v29, types: [android.content.pm.PackageInfo] */
            /* JADX WARN: Type inference failed for: r2v33 */
            /* JADX WARN: Type inference failed for: r2v34 */
            /* JADX WARN: Type inference failed for: r2v4, types: [android.content.pm.PackageInfo] */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v20 */
            /* JADX WARN: Type inference failed for: r3v25 */
            /* JADX WARN: Type inference failed for: r3v26 */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r8v1, types: [N4.f] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instructions count: 544
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: N4.r.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object c(String str, Context context, J4.k kVar, P5.d dVar) {
            Object g8 = AbstractC2825i.g(C2812b0.a(), new b(str, context, kVar, null), dVar);
            if (g8 == Q5.b.e()) {
                return g8;
            }
            return I.f6487a;
        }

        public final void b(String filename, Context context, J4.k kVar) {
            AbstractC3159y.i(filename, "filename");
            AbstractC3159y.i(context, "context");
            AbstractC2829k.d(N.a(C2812b0.a()), null, null, new C0155a(filename, context, kVar, null), 3, null);
        }

        public final boolean d() {
            return O4.a.b();
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }
}
