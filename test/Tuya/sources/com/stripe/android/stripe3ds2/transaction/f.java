package com.stripe.android.stripe3ds2.transaction;

import L5.s;
import L5.t;
import Y3.d;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.d;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private final V3.k f26830a;

        /* renamed from: b, reason: collision with root package name */
        private final SecretKey f26831b;

        /* renamed from: c, reason: collision with root package name */
        private final U3.c f26832c;

        /* renamed from: d, reason: collision with root package name */
        private final c.a f26833d;

        public a(V3.k messageTransformer, SecretKey secretKey, U3.c errorReporter, c.a creqExecutorConfig) {
            AbstractC3159y.i(messageTransformer, "messageTransformer");
            AbstractC3159y.i(secretKey, "secretKey");
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f26830a = messageTransformer;
            this.f26831b = secretKey;
            this.f26832c = errorReporter;
            this.f26833d = creqExecutorConfig;
        }

        private final Y3.d b(Y3.a aVar, int i8, String str, String str2) {
            String valueOf = String.valueOf(i8);
            d.c cVar = d.c.f13148c;
            return new Y3.d(aVar.o(), aVar.e(), null, valueOf, cVar, str, str2, "CRes", aVar.k(), aVar.n(), 4, null);
        }

        private final JSONObject c(String str) {
            return this.f26830a.G(str, this.f26831b);
        }

        private final boolean d(Y3.a aVar, Y3.b bVar) {
            return AbstractC3159y.d(aVar.k(), bVar.I());
        }

        private final boolean e(Y3.a aVar, Y3.b bVar) {
            if (AbstractC3159y.d(aVar.n(), bVar.V()) && AbstractC3159y.d(aVar.o(), bVar.X()) && AbstractC3159y.d(aVar.e(), bVar.i())) {
                return true;
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.f
        public Object a(Y3.a aVar, X3.l lVar, P5.d dVar) {
            Object b8;
            if (lVar.b()) {
                JSONObject jSONObject = new JSONObject(lVar.a());
                d.a aVar2 = Y3.d.f13136k;
                if (aVar2.b(jSONObject)) {
                    return new d.b(aVar2.a(jSONObject));
                }
                return new d.c(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                s.a aVar3 = s.f6511b;
                b8 = s.b(c(lVar.a()));
            } catch (Throwable th) {
                s.a aVar4 = s.f6511b;
                b8 = s.b(t.a(th));
            }
            Throwable e8 = s.e(b8);
            if (e8 != null) {
                this.f26832c.i(new RuntimeException(g6.n.e("\n                            Failed to process challenge response.\n\n                            CReq = " + aVar.u() + "\n                            "), e8));
            }
            Throwable e9 = s.e(b8);
            if (e9 == null) {
                return f(aVar, (JSONObject) b8);
            }
            Y3.f fVar = Y3.f.f13167i;
            int b9 = fVar.b();
            String c8 = fVar.c();
            String message = e9.getMessage();
            if (message == null) {
                message = "";
            }
            return new d.b(b(aVar, b9, c8, message));
        }

        public final d f(Y3.a creqData, JSONObject payload) {
            Object b8;
            d.b bVar;
            d c0679d;
            AbstractC3159y.i(creqData, "creqData");
            AbstractC3159y.i(payload, "payload");
            d.a aVar = Y3.d.f13136k;
            if (aVar.b(payload)) {
                return new d.b(aVar.a(payload));
            }
            try {
                s.a aVar2 = s.f6511b;
                b8 = s.b(Y3.b.f13094C.d(payload));
            } catch (Throwable th) {
                s.a aVar3 = s.f6511b;
                b8 = s.b(t.a(th));
            }
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                Y3.b bVar2 = (Y3.b) b8;
                if (!e(creqData, bVar2)) {
                    Y3.f fVar = Y3.f.f13166h;
                    c0679d = new d.b(b(creqData, fVar.b(), fVar.c(), "The Transaction ID received was invalid."));
                } else if (!d(creqData, bVar2)) {
                    Y3.f fVar2 = Y3.f.f13162d;
                    bVar = new d.b(b(creqData, fVar2.b(), fVar2.c(), creqData.k()));
                } else {
                    c0679d = new d.C0679d(creqData, bVar2, this.f26833d);
                }
                return c0679d;
            }
            if (e8 instanceof Y3.c) {
                Y3.c cVar = (Y3.c) e8;
                bVar = new d.b(b(creqData, cVar.a(), cVar.b(), cVar.c()));
            } else {
                return new d.c(e8);
            }
            return bVar;
        }
    }

    Object a(Y3.a aVar, X3.l lVar, P5.d dVar);
}
