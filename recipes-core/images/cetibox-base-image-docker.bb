require recipes-core/images/cetibox-base-image.inc
require recipes-core/images/cetibox-base-image-docker.inc
require cetibox-base-only.inc

DESCRIPTION = "The CETiBOX Base Edition image with docker support"

IMAGE_FEATURES += "empty-root-password allow-empty-password"
