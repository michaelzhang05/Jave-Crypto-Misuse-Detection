package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);

    @GuardedBy("activeFilesLock")
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final Function1 coordinatorProducer;
    private final Function0 produceFile;
    private final Serializer<T> serializer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.core.FileStorage$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterProcessCoordinator invoke(File it) {
            AbstractC3255y.i(it, "it");
            return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(it);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public FileStorage(Serializer<T> serializer, Function1 coordinatorProducer, Function0 produceFile) {
        AbstractC3255y.i(serializer, "serializer");
        AbstractC3255y.i(coordinatorProducer, "coordinatorProducer");
        AbstractC3255y.i(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        File file = ((File) this.produceFile.invoke()).getCanonicalFile();
        synchronized (activeFilesLock) {
            String path = file.getAbsolutePath();
            Set<String> set = activeFiles;
            if (!set.contains(path)) {
                AbstractC3255y.h(path, "path");
                set.add(path);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        AbstractC3255y.h(file, "file");
        return new FileStorageConnection(file, this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(file), new FileStorage$createConnection$2(file));
    }

    public /* synthetic */ FileStorage(Serializer serializer, Function1 function1, Function0 function0, int i8, AbstractC3247p abstractC3247p) {
        this(serializer, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : function1, function0);
    }
}
