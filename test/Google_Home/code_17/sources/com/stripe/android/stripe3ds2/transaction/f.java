package com.stripe.android.stripe3ds2.transaction;

import O5.s;
import O5.t;
import b4.C1975a;
import b4.d;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.d;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Y3.k f27885a;

        /* renamed from: b, reason: collision with root package name */
        private final SecretKey f27886b;

        /* renamed from: c, reason: collision with root package name */
        private final X3.c f27887c;

        /* renamed from: d, reason: collision with root package name */
        private final c.a f27888d;

        public a(Y3.k messageTransformer, SecretKey secretKey, X3.c errorReporter, c.a creqExecutorConfig) {
            AbstractC3255y.i(messageTransformer, "messageTransformer");
            AbstractC3255y.i(secretKey, "secretKey");
            AbstractC3255y.i(errorReporter, "errorReporter");
            AbstractC3255y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f27885a = messageTransformer;
            this.f27886b = secretKey;
            this.f27887c = errorReporter;
            this.f27888d = creqExecutorConfig;
        }

        private final b4.d b(C1975a c1975a, int i8, String str, String str2) {
            String valueOf = String.valueOf(i8);
            d.c cVar = d.c.f15433c;
            return new b4.d(c1975a.v(), c1975a.g(), null, valueOf, cVar, str, str2, "CRes", c1975a.s(), c1975a.u(), 4, null);
        }

        private final JSONObject c(String str) {
            return this.f27885a.J(str, this.f27886b);
        }

        private final boolean d(C1975a c1975a, b4.b bVar) {
            return AbstractC3255y.d(c1975a.s(), bVar.z());
        }

        private final boolean e(C1975a c1975a, b4.b bVar) {
            if (AbstractC3255y.d(c1975a.u(), bVar.W()) && AbstractC3255y.d(c1975a.v(), bVar.X()) && AbstractC3255y.d(c1975a.g(), bVar.i())) {
                return true;
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.f
        public Object a(C1975a c1975a, a4.l lVar, S5.d dVar) {
            Object b8;
            if (lVar.b()) {
                JSONObject jSONObject = new JSONObject(lVar.a());
                d.a aVar = b4.d.f15421k;
                if (aVar.b(jSONObject)) {
                    return new d.b(aVar.a(jSONObject));
                }
                return new d.c(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                s.a aVar2 = s.f8302b;
                b8 = s.b(c(lVar.a()));
            } catch (Throwable th) {
                s.a aVar3 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            Throwable e8 = s.e(b8);
            if (e8 != null) {
                this.f27887c.l(new RuntimeException(j6.n.e("\n                            Failed to process challenge response.\n\n                            CReq = " + c1975a.w() + "\n                            "), e8));
            }
            Throwable e9 = s.e(b8);
            if (e9 == null) {
                return f(c1975a, (JSONObject) b8);
            }
            b4.f fVar = b4.f.f15452i;
            int b9 = fVar.b();
            String c8 = fVar.c();
            String message = e9.getMessage();
            if (message == null) {
                message = "";
            }
            return new d.b(b(c1975a, b9, c8, message));
        }

        public final d f(C1975a creqData, JSONObject payload) {
            Object b8;
            d.b bVar;
            d c0675d;
            AbstractC3255y.i(creqData, "creqData");
            AbstractC3255y.i(payload, "payload");
            d.a aVar = b4.d.f15421k;
            if (aVar.b(payload)) {
                return new d.b(aVar.a(payload));
            }
            try {
                s.a aVar2 = s.f8302b;
                b8 = s.b(b4.b.f15379C.d(payload));
            } catch (Throwable th) {
                s.a aVar3 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                b4.b bVar2 = (b4.b) b8;
                if (!e(creqData, bVar2)) {
                    b4.f fVar = b4.f.f15451h;
                    c0675d = new d.b(b(creqData, fVar.b(), fVar.c(), "The Transaction ID received was invalid."));
                } else if (!d(creqData, bVar2)) {
                    b4.f fVar2 = b4.f.f15447d;
                    bVar = new d.b(b(creqData, fVar2.b(), fVar2.c(), creqData.s()));
                } else {
                    c0675d = new d.C0675d(creqData, bVar2, this.f27888d);
                }
                return c0675d;
            }
            if (e8 instanceof b4.c) {
                b4.c cVar = (b4.c) e8;
                bVar = new d.b(b(creqData, cVar.a(), cVar.b(), cVar.c()));
            } else {
                return new d.c(e8);
            }
            return bVar;
        }
    }

    Object a(C1975a c1975a, a4.l lVar, S5.d dVar);
}
