### Lein Figwheel Example With Autotesting

This trivial application serves as an example of
combining figwheel, reagent, and some cljs.test configuration
to allow auto-running tests in the browser on code reload.

#### To Run

The project includes 2 builds -- `dev` for building just the app itself
and `test` for the test suite.

Run just dev with:

```
lein figwheel dev
```

or just test:

```
lein figwheel test
```

or both:

```
lein figwheel dev test
```

View the app at `http://localhost:3449/` and the tests at `http://localhost:3449/test.html`.

(`3449` is the default port, but this is configurable under the
`:figwheel` settings in `project.clj`)

__Test Display__

Currently test output is just displayed in the JS dev console. Maybe
will add some HTML display at some point.

__Getting Correct Test Auto-Building__

I have been struggling a lot with getting correct behavior from the test auto-builder.
I would like to have the tests run automatically in the browser via figwheel's notification infrastructure
whenever a file is saved.

But running the standard test build with `lein figwheel test` seems to produce
inconsistent behavior -- new changes to test files are not usually picked up.

At the moment, I've found that I need to _also_ run `cljsbuild auto test` as a way
of ensuring that test files get re-compiled on every save. This combo is a bit frustrating
since you need to have 2 build processes going at any time, but it's the only thing I've
been able to get working very consistently so far.

### Credit

Thanks to @bhauman for figwheel! Most of the ideas in this example were
cobbled together from his [crashverse](https://github.com/bhauman/crashverse) example
or from various figwheel readmes I found.
