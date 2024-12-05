package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class TypeFactory implements Serializable {
    private static final Class<?> CLS_BOOL;
    private static final Class<?> CLS_INT;
    private static final Class<?> CLS_LONG;
    protected static final SimpleType CORE_TYPE_BOOL;
    protected static final SimpleType CORE_TYPE_CLASS;
    protected static final SimpleType CORE_TYPE_COMPARABLE;
    protected static final SimpleType CORE_TYPE_ENUM;
    protected static final SimpleType CORE_TYPE_INT;
    protected static final SimpleType CORE_TYPE_LONG;
    protected static final SimpleType CORE_TYPE_OBJECT;
    protected static final SimpleType CORE_TYPE_STRING;
    protected final ClassLoader _classLoader;
    protected final TypeModifier[] _modifiers;
    protected final TypeParser _parser;
    protected final LRUMap<Object, JavaType> _typeCache;
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
    private static final Class<?> CLS_STRING = String.class;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Class<?> CLS_COMPARABLE = Comparable.class;
    private static final Class<?> CLS_CLASS = Class.class;
    private static final Class<?> CLS_ENUM = Enum.class;

    static {
        Class<?> cls = Boolean.TYPE;
        CLS_BOOL = cls;
        Class<?> cls2 = Integer.TYPE;
        CLS_INT = cls2;
        Class<?> cls3 = Long.TYPE;
        CLS_LONG = cls3;
        CORE_TYPE_BOOL = new SimpleType(cls);
        CORE_TYPE_INT = new SimpleType(cls2);
        CORE_TYPE_LONG = new SimpleType(cls3);
        CORE_TYPE_STRING = new SimpleType(String.class);
        CORE_TYPE_OBJECT = new SimpleType(Object.class);
        CORE_TYPE_COMPARABLE = new SimpleType(Comparable.class);
        CORE_TYPE_ENUM = new SimpleType(Enum.class);
        CORE_TYPE_CLASS = new SimpleType(Class.class);
    }

    private TypeFactory() {
        this(null);
    }

    private TypeBindings _bindingsForSubtype(JavaType javaType, int i2, Class<?> cls) {
        int containedTypeCount = javaType.containedTypeCount();
        if (containedTypeCount != i2) {
            return TypeBindings.emptyBindings();
        }
        if (i2 == 1) {
            return TypeBindings.create(cls, javaType.containedType(0));
        }
        if (i2 == 2) {
            return TypeBindings.create(cls, javaType.containedType(0), javaType.containedType(1));
        }
        ArrayList arrayList = new ArrayList(containedTypeCount);
        for (int i3 = 0; i3 < containedTypeCount; i3++) {
            arrayList.add(javaType.containedType(i3));
        }
        return TypeBindings.create(cls, arrayList);
    }

    private JavaType _collectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType2 = typeParameters.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": can not determine type parameters");
        }
        return CollectionType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    private JavaType _mapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType _unknownType;
        JavaType javaType2;
        JavaType javaType3;
        if (cls == Properties.class) {
            _unknownType = CORE_TYPE_STRING;
        } else {
            List<JavaType> typeParameters = typeBindings.getTypeParameters();
            int size = typeParameters.size();
            if (size != 0) {
                if (size == 2) {
                    JavaType javaType4 = typeParameters.get(0);
                    javaType2 = typeParameters.get(1);
                    javaType3 = javaType4;
                    return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
                }
                throw new IllegalArgumentException("Strange Map type " + cls.getName() + ": can not determine type parameters");
            }
            _unknownType = _unknownType();
        }
        javaType3 = _unknownType;
        javaType2 = javaType3;
        return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
    }

    private JavaType _referenceType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType2 = typeParameters.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": can not determine type parameters");
        }
        return ReferenceType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    protected JavaType _constructSimple(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType _findWellKnownSimple;
        return (!typeBindings.isEmpty() || (_findWellKnownSimple = _findWellKnownSimple(cls)) == null) ? _newSimpleType(cls, typeBindings, javaType, javaTypeArr) : _findWellKnownSimple;
    }

    protected Class<?> _findPrimitive(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    protected JavaType _findWellKnownSimple(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == CLS_BOOL) {
                return CORE_TYPE_BOOL;
            }
            if (cls == CLS_INT) {
                return CORE_TYPE_INT;
            }
            if (cls == CLS_LONG) {
                return CORE_TYPE_LONG;
            }
            return null;
        }
        if (cls == CLS_STRING) {
            return CORE_TYPE_STRING;
        }
        if (cls == CLS_OBJECT) {
            return CORE_TYPE_OBJECT;
        }
        return null;
    }

    protected JavaType _fromAny(ClassStack classStack, Type type, TypeBindings typeBindings) {
        JavaType _fromWildcard;
        if (type instanceof Class) {
            _fromWildcard = _fromClass(classStack, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            _fromWildcard = _fromParamType(classStack, (ParameterizedType) type, typeBindings);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                _fromWildcard = _fromArrayType(classStack, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                _fromWildcard = _fromVariable(classStack, (TypeVariable) type, typeBindings);
            } else if (type instanceof WildcardType) {
                _fromWildcard = _fromWildcard(classStack, (WildcardType) type, typeBindings);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized Type: ");
                sb.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (this._modifiers != null) {
            _fromWildcard.getBindings();
            TypeModifier[] typeModifierArr = this._modifiers;
            if (typeModifierArr.length > 0) {
                TypeModifier typeModifier = typeModifierArr[0];
                throw null;
            }
        }
        return _fromWildcard;
    }

    protected JavaType _fromArrayType(ClassStack classStack, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_fromAny(classStack, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaType _fromClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        ClassStack child;
        JavaType _resolveSuperClass;
        JavaType[] _resolveSuperInterfaces;
        JavaType _newSimpleType;
        JavaType _findWellKnownSimple = _findWellKnownSimple(cls);
        if (_findWellKnownSimple != null) {
            return _findWellKnownSimple;
        }
        Object asKey = (typeBindings == null || typeBindings.isEmpty()) ? cls : typeBindings.asKey(cls);
        JavaType javaType = this._typeCache.get(asKey);
        if (javaType != null) {
            return javaType;
        }
        if (classStack == null) {
            child = new ClassStack(cls);
        } else {
            ClassStack find = classStack.find(cls);
            if (find != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, EMPTY_BINDINGS);
                find.addSelfReference(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            child = classStack.child(cls);
        }
        if (cls.isArray()) {
            _newSimpleType = ArrayType.construct(_fromAny(child, cls.getComponentType(), typeBindings), typeBindings);
        } else {
            if (cls.isInterface()) {
                _resolveSuperClass = null;
                _resolveSuperInterfaces = _resolveSuperInterfaces(child, cls, typeBindings);
            } else {
                _resolveSuperClass = _resolveSuperClass(child, cls, typeBindings);
                _resolveSuperInterfaces = _resolveSuperInterfaces(child, cls, typeBindings);
            }
            JavaType javaType2 = _resolveSuperClass;
            JavaType[] javaTypeArr = _resolveSuperInterfaces;
            if (cls == Properties.class) {
                SimpleType simpleType = CORE_TYPE_STRING;
                javaType = MapType.construct(cls, typeBindings, javaType2, javaTypeArr, simpleType, simpleType);
            } else if (javaType2 != null) {
                javaType = javaType2.refine(cls, typeBindings, javaType2, javaTypeArr);
            }
            _newSimpleType = (javaType == null && (javaType = _fromWellKnownClass(child, cls, typeBindings, javaType2, javaTypeArr)) == null && (javaType = _fromWellKnownInterface(child, cls, typeBindings, javaType2, javaTypeArr)) == null) ? _newSimpleType(cls, typeBindings, javaType2, javaTypeArr) : javaType;
        }
        child.resolveSelfReferences(_newSimpleType);
        if (!_newSimpleType.hasHandlers()) {
            this._typeCache.putIfAbsent(asKey, _newSimpleType);
        }
        return _newSimpleType;
    }

    protected JavaType _fromParamType(ClassStack classStack, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        TypeBindings create;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == CLS_ENUM) {
            return CORE_TYPE_ENUM;
        }
        if (cls == CLS_COMPARABLE) {
            return CORE_TYPE_COMPARABLE;
        }
        if (cls == CLS_CLASS) {
            return CORE_TYPE_CLASS;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            create = EMPTY_BINDINGS;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i2 = 0; i2 < length; i2++) {
                javaTypeArr[i2] = _fromAny(classStack, actualTypeArguments[i2], typeBindings);
            }
            create = TypeBindings.create(cls, javaTypeArr);
        }
        return _fromClass(classStack, cls, create);
    }

    protected JavaType _fromVariable(ClassStack classStack, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        String name = typeVariable.getName();
        JavaType findBoundType = typeBindings.findBoundType(name);
        if (findBoundType != null) {
            return findBoundType;
        }
        if (typeBindings.hasUnbound(name)) {
            return CORE_TYPE_OBJECT;
        }
        return _fromAny(classStack, typeVariable.getBounds()[0], typeBindings.withUnboundVariable(name));
    }

    protected JavaType _fromWellKnownClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = TypeBindings.emptyBindings();
        }
        if (cls == Map.class) {
            return _mapType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return _collectionType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return _referenceType(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    protected JavaType _fromWellKnownInterface(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType refine = javaType2.refine(cls, typeBindings, javaType, javaTypeArr);
            if (refine != null) {
                return refine;
            }
        }
        return null;
    }

    protected JavaType _fromWildcard(ClassStack classStack, WildcardType wildcardType, TypeBindings typeBindings) {
        return _fromAny(classStack, wildcardType.getUpperBounds()[0], typeBindings);
    }

    protected JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    protected JavaType _resolveSuperClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type genericSuperclass = ClassUtil.getGenericSuperclass(cls);
        if (genericSuperclass == null) {
            return null;
        }
        return _fromAny(classStack, genericSuperclass, typeBindings);
    }

    protected JavaType[] _resolveSuperInterfaces(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type[] genericInterfaces = ClassUtil.getGenericInterfaces(cls);
        if (genericInterfaces != null && genericInterfaces.length != 0) {
            int length = genericInterfaces.length;
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i2 = 0; i2 < length; i2++) {
                javaTypeArr[i2] = _fromAny(classStack, genericInterfaces[i2], typeBindings);
            }
            return javaTypeArr;
        }
        return NO_TYPES;
    }

    protected JavaType _unknownType() {
        return CORE_TYPE_OBJECT;
    }

    protected Class<?> classForName(String str, boolean z, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public JavaType constructFromCanonical(String str) throws IllegalArgumentException {
        return this._parser.parse(str);
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType != null) {
            return findSuperType;
        }
        if (!cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType _fromClass;
        JavaType _fromClass2;
        if (cls == Properties.class) {
            _fromClass = CORE_TYPE_STRING;
            _fromClass2 = _fromClass;
        } else {
            TypeBindings typeBindings = EMPTY_BINDINGS;
            _fromClass = _fromClass(null, cls2, typeBindings);
            _fromClass2 = _fromClass(null, cls3, typeBindings);
        }
        return constructMapType(cls, _fromClass, _fromClass2);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        JavaType refine;
        JavaType _fromClass;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        if (rawClass == Object.class) {
            _fromClass = _fromClass(null, cls, TypeBindings.emptyBindings());
        } else if (rawClass.isAssignableFrom(cls)) {
            if (javaType.getBindings().isEmpty()) {
                _fromClass = _fromClass(null, cls, TypeBindings.emptyBindings());
            } else {
                if (javaType.isContainerType()) {
                    if (javaType.isMapLikeType()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            _fromClass = _fromClass(null, cls, TypeBindings.create(cls, javaType.getKeyType(), javaType.getContentType()));
                        }
                    } else if (javaType.isCollectionLikeType()) {
                        if (cls != ArrayList.class && cls != LinkedList.class && cls != HashSet.class && cls != TreeSet.class) {
                            if (rawClass == EnumSet.class) {
                                return javaType;
                            }
                        } else {
                            _fromClass = _fromClass(null, cls, TypeBindings.create(cls, javaType.getContentType()));
                        }
                    }
                }
                int length = cls.getTypeParameters().length;
                if (length == 0) {
                    _fromClass = _fromClass(null, cls, TypeBindings.emptyBindings());
                } else {
                    TypeBindings _bindingsForSubtype = _bindingsForSubtype(javaType, length, cls);
                    if (javaType.isInterface()) {
                        refine = javaType.refine(cls, _bindingsForSubtype, null, new JavaType[]{javaType});
                    } else {
                        refine = javaType.refine(cls, _bindingsForSubtype, javaType, NO_TYPES);
                    }
                    _fromClass = refine == null ? _fromClass(null, cls, _bindingsForSubtype) : refine;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Class %s not subtype of %s", cls.getName(), javaType));
        }
        return _fromClass.withHandlersFrom(javaType);
    }

    public JavaType constructType(Type type) {
        return _fromAny(null, type, EMPTY_BINDINGS);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> _findPrimitive;
        if (str.indexOf(46) < 0 && (_findPrimitive = _findPrimitive(str)) != null) {
            return _findPrimitive;
        }
        Throwable th = null;
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return classForName(str, true, classLoader);
            } catch (Exception e2) {
                th = ClassUtil.getRootCause(e2);
            }
        }
        try {
            return classForName(str);
        } catch (Exception e3) {
            if (th == null) {
                th = ClassUtil.getRootCause(e3);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType == null) {
            return NO_TYPES;
        }
        return findSuperType.getBindings().typeParameterArray();
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        return _constructSimple(cls, EMPTY_BINDINGS, null, null);
    }

    protected TypeFactory(LRUMap<Object, JavaType> lRUMap) {
        this._typeCache = lRUMap == null ? new LRUMap<>(16, 200) : lRUMap;
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    protected Class<?> classForName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        return (CollectionType) _fromClass(null, cls, TypeBindings.create(cls, javaType));
    }

    public JavaType constructType(Type type, TypeBindings typeBindings) {
        return _fromAny(null, type, typeBindings);
    }

    public JavaType constructType(TypeReference<?> typeReference) {
        return _fromAny(null, typeReference.getType(), EMPTY_BINDINGS);
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        return (MapType) _fromClass(null, cls, TypeBindings.create(cls, new JavaType[]{javaType, javaType2}));
    }
}
