package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class CheckDrawingCache {
    private final Path checkPath;
    private final PathMeasure pathMeasure;
    private final Path pathToDraw;

    public CheckDrawingCache() {
        this(null, null, null, 7, null);
    }

    public final Path getCheckPath() {
        return this.checkPath;
    }

    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public CheckDrawingCache(Path checkPath, PathMeasure pathMeasure, Path pathToDraw) {
        AbstractC3159y.i(checkPath, "checkPath");
        AbstractC3159y.i(pathMeasure, "pathMeasure");
        AbstractC3159y.i(pathToDraw, "pathToDraw");
        this.checkPath = checkPath;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = pathToDraw;
    }

    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i8 & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i8 & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}
