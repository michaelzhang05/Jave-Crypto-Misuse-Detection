package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f21886f;

    public UninitializedMessageException(o oVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f21886f = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
