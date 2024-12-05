package androidx.compose.ui.semantics;

import L5.r;
import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import d6.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SemanticsModifierKt {
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(Q.d(AbstractC1246t.x(semanticsConfiguration, 10)), 16));
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            SemanticsPropertyKey<?> key = entry.getKey();
            r a8 = x.a(key.getName(), entry.getValue());
            linkedHashMap.put(a8.c(), a8.d());
        }
        properties.set("properties", linkedHashMap);
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, Function1 function1) {
        return modifier.then(new ClearAndSetSemanticsElement(function1));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static final Modifier semantics(Modifier modifier, boolean z8, Function1 function1) {
        return modifier.then(new AppendedSemanticsElement(z8, function1));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return semantics(modifier, z8, function1);
    }
}
