package Q4;

import H4.j;
import O5.I;
import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9197a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: Q4.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0184a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9198a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9199b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f9200c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ M4.k f9201d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0184a(String str, Context context, M4.k kVar, S5.d dVar) {
                super(2, dVar);
                this.f9199b = str;
                this.f9200c = context;
                this.f9201d = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0184a(this.f9199b, this.f9200c, this.f9201d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f9198a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    a aVar = r.f9197a;
                    String str = this.f9199b;
                    Context context = this.f9200c;
                    M4.k kVar = this.f9201d;
                    this.f9198a = 1;
                    if (aVar.c(str, context, kVar, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0184a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            Object f9202a;

            /* renamed from: b, reason: collision with root package name */
            Object f9203b;

            /* renamed from: c, reason: collision with root package name */
            int f9204c;

            /* renamed from: d, reason: collision with root package name */
            int f9205d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9206e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f9207f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ M4.k f9208g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: Q4.r$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0185a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f9209a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M4.k f9210b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9211c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9212d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0185a(M4.k kVar, String str, String str2, S5.d dVar) {
                    super(2, dVar);
                    this.f9210b = kVar;
                    this.f9211c = str;
                    this.f9212d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0185a(this.f9210b, this.f9211c, this.f9212d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f9209a == 0) {
                        O5.t.b(obj);
                        M4.k kVar = this.f9210b;
                        if (kVar != null) {
                            kVar.e(this.f9211c);
                        }
                        j.a aVar = H4.j.f3824g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9212d);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(304, bundle);
                            }
                        }
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0185a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: Q4.r$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0186b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f9213a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M4.k f9214b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9215c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9216d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0186b(M4.k kVar, String str, String str2, S5.d dVar) {
                    super(2, dVar);
                    this.f9214b = kVar;
                    this.f9215c = str;
                    this.f9216d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0186b(this.f9214b, this.f9215c, this.f9216d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f9213a == 0) {
                        O5.t.b(obj);
                        M4.k kVar = this.f9214b;
                        if (kVar != null) {
                            kVar.a(this.f9215c);
                        }
                        j.a aVar = H4.j.f3824g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9216d);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(301, bundle);
                            }
                        }
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0186b) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f9217a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M4.k f9218b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9219c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9220d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f9221e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(M4.k kVar, String str, String str2, String str3, S5.d dVar) {
                    super(2, dVar);
                    this.f9218b = kVar;
                    this.f9219c = str;
                    this.f9220d = str2;
                    this.f9221e = str3;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new c(this.f9218b, this.f9219c, this.f9220d, this.f9221e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f9217a == 0) {
                        O5.t.b(obj);
                        M4.k kVar = this.f9218b;
                        if (kVar != null) {
                            kVar.c(this.f9219c, this.f9220d);
                        }
                        j.a aVar = H4.j.f3824g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9221e);
                            bundle.putString("filename", this.f9219c);
                            bundle.putString("errorMsg", this.f9220d);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(303, bundle);
                            }
                        }
                        return I.f8278a;
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
                int f9222a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M4.k f9223b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9224c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9225d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(M4.k kVar, String str, String str2, S5.d dVar) {
                    super(2, dVar);
                    this.f9223b = kVar;
                    this.f9224c = str;
                    this.f9225d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new d(this.f9223b, this.f9224c, this.f9225d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f9222a == 0) {
                        O5.t.b(obj);
                        M4.k kVar = this.f9223b;
                        if (kVar != null) {
                            kVar.b(this.f9224c);
                        }
                        j.a aVar = H4.j.f3824g;
                        if (aVar.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9225d);
                            bundle.putString("filename", this.f9224c);
                            ResultReceiver s8 = aVar.s();
                            if (s8 != null) {
                                s8.send(302, bundle);
                            }
                        }
                        return I.f8278a;
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
                int f9226a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M4.k f9227b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9228c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(M4.k kVar, String str, S5.d dVar) {
                    super(2, dVar);
                    this.f9227b = kVar;
                    this.f9228c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new e(this.f9227b, this.f9228c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f9226a == 0) {
                        O5.t.b(obj);
                        M4.k kVar = this.f9227b;
                        if (kVar != null) {
                            kVar.d(this.f9228c);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Context context, M4.k kVar, S5.d dVar) {
                super(2, dVar);
                this.f9206e = str;
                this.f9207f = context;
                this.f9208g = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f9206e, this.f9207f, this.f9208g, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x012d A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x018c A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x01a7 A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Type inference failed for: r11v6, types: [Q4.f] */
            /* JADX WARN: Type inference failed for: r12v0, types: [Q4.f] */
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
            /* JADX WARN: Type inference failed for: r8v1, types: [Q4.f] */
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
                throw new UnsupportedOperationException("Method not decompiled: Q4.r.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object c(String str, Context context, M4.k kVar, S5.d dVar) {
            Object g8 = AbstractC3360i.g(C3347b0.a(), new b(str, context, kVar, null), dVar);
            if (g8 == T5.b.e()) {
                return g8;
            }
            return I.f8278a;
        }

        public final void b(String filename, Context context, M4.k kVar) {
            AbstractC3255y.i(filename, "filename");
            AbstractC3255y.i(context, "context");
            AbstractC3364k.d(N.a(C3347b0.a()), null, null, new C0184a(filename, context, kVar, null), 3, null);
        }

        public final boolean d() {
            return R4.a.b();
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }
}
