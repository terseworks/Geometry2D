# Geometry2D

## About

Every physical simulation program requires some form of intersection testing. This little Java library was designed to handle simple two-dimensional simulations without rotation. Because simulations run in a tight loop 30 to 60 times per second, we want to avoid memory allocation when it isn't necessary. Thus, these methods use output parameters instead of new objects to report contact results.

The shapes and methods here assume the simulation does not support rotations. This makes contact point generation a trivial task. Contact resolution is another matter entirely, but despite the desired method of resolution, this library provides enough information to get the job done.

The main program provides a few examples to show how the system works.

## Features

- Vector, circle, rectangle, and plane/halfspace shapes.
- Intersection testing.
- Collision resolution data.
- Ray casting with contact point reporting.
- Closest point in shape reporting.

## Code Usage

Feel free to use any part of this project for your own needs.
