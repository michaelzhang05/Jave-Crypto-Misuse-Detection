package androidx.window.embedding;

import L5.I;
import M5.AbstractC1246t;
import M5.a0;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitController {
    private static volatile SplitController globalInstance = null;
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock reentrantLock = SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        SplitController.globalInstance = new SplitController(null);
                    }
                    I i8 = I.f6487a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            SplitController splitController = SplitController.globalInstance;
            AbstractC3159y.f(splitController);
            return splitController;
        }

        public final void initialize(Context context, int i8) {
            AbstractC3159y.i(context, "context");
            Set<EmbeddingRule> parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i8);
            SplitController companion = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = a0.f();
            }
            companion.setStaticSplitRules(parseSplitRules$window_release);
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ SplitController(AbstractC3151p abstractC3151p) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i8) {
        Companion.initialize(context, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(executor, "executor");
        AbstractC3159y.i(consumer, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return AbstractC1246t.b1(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule rule) {
        AbstractC3159y.i(rule, "rule");
        this.embeddingBackend.registerRule(rule);
    }

    public final void removeSplitListener(Consumer<List<SplitInfo>> consumer) {
        AbstractC3159y.i(consumer, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(consumer);
    }

    public final void unregisterRule(EmbeddingRule rule) {
        AbstractC3159y.i(rule, "rule");
        this.embeddingBackend.unregisterRule(rule);
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = a0.f();
    }
}
