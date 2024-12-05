package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* compiled from: SpanStatus.java */
/* loaded from: classes2.dex */
public enum j5 implements r2 {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* compiled from: SpanStatus.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<j5> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j5 a(n2 n2Var, w1 w1Var) throws Exception {
            return j5.valueOf(n2Var.u0().toUpperCase(Locale.ROOT));
        }
    }

    j5(int i2) {
        this.minHttpStatusCode = i2;
        this.maxHttpStatusCode = i2;
    }

    public static j5 fromHttpStatusCode(int i2) {
        for (j5 j5Var : values()) {
            if (j5Var.matches(i2)) {
                return j5Var;
            }
        }
        return null;
    }

    private boolean matches(int i2) {
        return i2 >= this.minHttpStatusCode && i2 <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.b(name().toLowerCase(Locale.ROOT));
    }

    public static j5 fromHttpStatusCode(Integer num, j5 j5Var) {
        j5 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : j5Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : j5Var;
    }

    j5(int i2, int i3) {
        this.minHttpStatusCode = i2;
        this.maxHttpStatusCode = i3;
    }
}
