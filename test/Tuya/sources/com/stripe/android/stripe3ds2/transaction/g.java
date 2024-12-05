package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.f;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface g {

    /* loaded from: classes4.dex */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private final V3.k f26834a;

        /* renamed from: b, reason: collision with root package name */
        private final U3.c f26835b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a f26836c;

        public a(V3.k messageTransformer, U3.c errorReporter, c.a creqExecutorConfig) {
            AbstractC3159y.i(messageTransformer, "messageTransformer");
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f26834a = messageTransformer;
            this.f26835b = errorReporter;
            this.f26836c = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.a a(SecretKey secretKey) {
            AbstractC3159y.i(secretKey, "secretKey");
            return new f.a(this.f26834a, secretKey, this.f26835b, this.f26836c);
        }
    }

    f a(SecretKey secretKey);
}
