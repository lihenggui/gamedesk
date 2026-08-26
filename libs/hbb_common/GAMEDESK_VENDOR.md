# GameDesk vendored hbb_common

This directory is vendored so a normal clone can build without initializing a
Git submodule.

- Upstream: `https://github.com/rustdesk/hbb_common`
- Upstream revision: `b2b1ac453d1d694046f63be20d792d608dac1c93`
- GameDesk changes: default `APP_NAME` and window-capture protocol messages.

To update it, export the desired upstream revision without its `.git`
directory, replace this directory, then reapply the two GameDesk changes and
update the revision above. Do not copy a nested Git repository into this path.
