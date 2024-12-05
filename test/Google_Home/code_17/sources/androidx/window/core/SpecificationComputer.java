package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i8, Object obj2) {
            if ((i8 & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i8 & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t8, String tag, VerificationMode verificationMode, Logger logger) {
            AbstractC3255y.i(t8, "<this>");
            AbstractC3255y.i(tag, "tag");
            AbstractC3255y.i(verificationMode, "verificationMode");
            AbstractC3255y.i(logger, "logger");
            return new ValidSpecification(t8, tag, verificationMode, logger);
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    public abstract T compute();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String createMessage(Object value, String message) {
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(message, "message");
        return message + " value: " + value;
    }

    public abstract SpecificationComputer<T> require(String str, Function1 function1);
}
