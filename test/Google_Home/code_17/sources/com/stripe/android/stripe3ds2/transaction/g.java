package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.f;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface g {

    /* loaded from: classes4.dex */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private final Y3.k f27889a;

        /* renamed from: b, reason: collision with root package name */
        private final X3.c f27890b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a f27891c;

        public a(Y3.k messageTransformer, X3.c errorReporter, c.a creqExecutorConfig) {
            AbstractC3255y.i(messageTransformer, "messageTransformer");
            AbstractC3255y.i(errorReporter, "errorReporter");
            AbstractC3255y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f27889a = messageTransformer;
            this.f27890b = errorReporter;
            this.f27891c = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.a a(SecretKey secretKey) {
            AbstractC3255y.i(secretKey, "secretKey");
            return new f.a(this.f27889a, secretKey, this.f27890b, this.f27891c);
        }
    }

    f a(SecretKey secretKey);
}
