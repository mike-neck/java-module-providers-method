java-module-providers-method
===

Example application of Jigsaw's additional feature of static factory method `provider()` on `ServiceLoader`.

The application using Jigsaw
---

To run the Jigsaw application, run the task `runModuleApp`.

```shell
./gradlew runModuleApp
```

The Jigsaw application consists of `mod-app` project and `mod-lib` project.

- Both `lib.factory` module and `lib.impl` module depends on `lib.api` module.
- The `app` module depends on all other modules.

```text
├── mod-app
│   └── src
│       └── main (app module -> lib.api, lib.impl(runtime), lib.factory(runtime))
└── mod-lib
    └── src
        ├── factory (lib.factory module -> lib.api)
        ├── impl (lib.impl module -> lib.api)
        └── main (lib.api module)
```

The application using jar
---

To run the jar application, run the task `runJarApp`.

```shell
./gradlew runJarApp
```

The jar application consists of `jar-app` project and `jar-lib` project.
The dependency tree is like the Jigsaw's one.
If Jigsaw is un-applied, `ServiceLoader` won't find `provider()` method.
That is the execution of the jar application will fail.

```text
├── jar-app
│   └── src
│       └── main(depends on jar-lib, jar-lib-impl, jar-lib-factory)
└── jar-lib
    └── src
        ├── factory (depends on main)
        ├── impl(depends on main)
        └── main
```
