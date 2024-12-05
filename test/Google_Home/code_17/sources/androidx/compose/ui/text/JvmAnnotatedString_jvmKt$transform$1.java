package androidx.compose.ui.text;

import a6.InterfaceC1669o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt$transform$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Map<Integer, Integer> $offsetMap;
    final /* synthetic */ T $resultStr;
    final /* synthetic */ AnnotatedString $this_transform;
    final /* synthetic */ InterfaceC1669o $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmAnnotatedString_jvmKt$transform$1(T t8, InterfaceC1669o interfaceC1669o, AnnotatedString annotatedString, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = t8;
        this.$transform = interfaceC1669o;
        this.$this_transform = annotatedString;
        this.$offsetMap = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(List<Integer> list) {
        int intValue = list.get(0).intValue();
        int intValue2 = list.get(1).intValue();
        this.$resultStr.f34162a = ((String) this.$resultStr.f34162a) + ((String) this.$transform.invoke(this.$this_transform.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2)));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(((String) this.$resultStr.f34162a).length()));
    }
}
