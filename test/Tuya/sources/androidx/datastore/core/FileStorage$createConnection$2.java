package androidx.datastore.core;

import L5.I;
import androidx.datastore.core.FileStorage;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class FileStorage$createConnection$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ File $file;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorage$createConnection$2(File file) {
        super(0);
        this.$file = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5445invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5445invoke() {
        FileStorage.Companion companion = FileStorage.Companion;
        Object activeFilesLock$datastore_core_release = companion.getActiveFilesLock$datastore_core_release();
        File file = this.$file;
        synchronized (activeFilesLock$datastore_core_release) {
            companion.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
            I i8 = I.f6487a;
        }
    }
}
